public class RedAppleSearchCriteria implements AppleSearchCriteria{
    @Override
    public boolean test(Apple apple) {
        return "red".equals(apple.getColor());
    }
}
