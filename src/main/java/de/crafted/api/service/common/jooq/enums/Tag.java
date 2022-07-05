/*
 * This file is generated by jOOQ.
 */
package de.crafted.api.service.common.jooq.enums;


import de.crafted.api.service.common.jooq.DefaultSchema;

import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum Tag implements EnumType {

    sanitary("sanitary"),

    wood("wood"),

    metal("metal"),

    electric("electric"),

    moving("moving"),

    painter("painter"),

    renovation("renovation"),

    gardening("gardening"),

    montage("montage");

    private final String literal;

    private Tag(String literal) {
        this.literal = literal;
    }

    @Override
    public Catalog getCatalog() {
        return getSchema().getCatalog();
    }

    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public String getName() {
        return "tag";
    }

    @Override
    public String getLiteral() {
        return literal;
    }
}
