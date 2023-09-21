package org.apereo.cas.support.wsfederation.web;

import org.apereo.cas.util.serialization.AbstractJacksonBackedStringSerializer;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;

import java.io.Serial;
import java.util.Map;

/**
 * This is {@link WsFederationServerStateSerializer}.
 *
 * @author Misagh Moayyed
 * @since 5.3.0
 */
public class WsFederationServerStateSerializer extends AbstractJacksonBackedStringSerializer<Map> {
    @Serial
    private static final long serialVersionUID = -1152522695984638020L;

    public WsFederationServerStateSerializer() {
        super(new MinimalPrettyPrinter());
    }

    @Override
    public Class<Map> getTypeToSerialize() {
        return Map.class;
    }
}