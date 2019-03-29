public class AssertUtil {

    public static <T extends Throwable> T assertThrows(Class<T> exceptionType, Action action) throws AssertionError {
        try {
            action.run();
            throw new AssertionError("Don't throw any exception.");
        }
        catch (Exception ex) {
            if(exceptionType.isInstance(ex)){
                return (T)ex;
            }
            throw new AssertionError("Expected throw " + exceptionType.getName() + " but throws " + ex.getClass().getTypeName());
        }
    }
}