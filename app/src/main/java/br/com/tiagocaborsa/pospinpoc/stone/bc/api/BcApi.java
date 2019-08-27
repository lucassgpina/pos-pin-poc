package br.com.tiagocaborsa.pospinpoc.stone.bc.api;

import java.util.Map;

public abstract class BcApi {

    protected final Map<String, Object> properties;

    public BcApi(Map<String, Object> properties) {
        this.properties = properties;
    }

    public abstract void goOnChip(final String tags);
}