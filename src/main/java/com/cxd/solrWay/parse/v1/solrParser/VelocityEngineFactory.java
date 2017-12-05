package com.cxd.solrWay.parse.v1.solrParser;

import org.apache.velocity.app.VelocityEngine;

/**
 * Created by childe on 2017/7/16.
 */
public enum VelocityEngineFactory {

    INSTANCE(new VelocityEngine());

    private VelocityEngine velocityEngine;

    VelocityEngineFactory(VelocityEngine velocityEngine) {
        this.velocityEngine = velocityEngine;
    }

    public static VelocityEngine getVelocityEngine() {
        return INSTANCE.velocityEngine;
    }
}
