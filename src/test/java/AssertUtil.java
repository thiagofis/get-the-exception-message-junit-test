public class AssertUtil {

    public static <T extends Throwable> T assertThrows(Class<T> exceptionType, Action action) throws AssertionError {
        try {
            action.run();
            throw new AssertionError("Didn't throw any exception.");
        }
        catch (Exception ex) {
            if(exceptionType.isInstance(ex)){
                return (T)ex;
            }
            throw new AssertionError("Expected throw " + exceptionType.getName() + " but threw " + ex.getClass().getTypeName());
        }
    }
}