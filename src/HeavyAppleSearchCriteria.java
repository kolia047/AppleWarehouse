public class HeavyAppleSearchCriteria implements AppleSearchCriteria{

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
