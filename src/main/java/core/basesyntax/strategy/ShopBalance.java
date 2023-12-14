package core.basesyntax.strategy;

import core.basesyntax.db.FruitStorage;
import core.basesyntax.models.FruitTransition;

public class ShopBalance implements ShopActivities {
    @Override
    public void updateStorageData(FruitTransition transition) {
        if (!FruitStorage.fruits.containsKey(transition.getFruitType())) {
            FruitStorage.fruits.put(transition.getFruitType(), transition.getFruitAmount());
        } else {
            throw new RuntimeException("We can't balance our fruits. "
                    + "This operation can only be called once.");
        }
    }
}
