package patterns.creational.abstractfactory.domain.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import patterns.creational.abstractfactory.domain.Plan;

public class DomesticPlan extends Plan {

    private static final Logger LOGGER = LoggerFactory.getLogger(DomesticPlan.class);

    @Override
    public void getRate() {
        LOGGER.info("Domestic rate");
    }
}
