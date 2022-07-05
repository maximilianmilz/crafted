/*
 * This file is generated by jOOQ.
 */
package de.crafted.api.service.common.jooq;


import de.crafted.api.service.common.jooq.tables.TicketTag;
import de.crafted.api.service.common.jooq.tables.UserTag;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DefaultSchema extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>DEFAULT_SCHEMA</code>
     */
    public static final DefaultSchema DEFAULT_SCHEMA = new DefaultSchema();

    /**
     * The table <code>ticket_tag</code>.
     */
    public final TicketTag TICKET_TAG = TicketTag.TICKET_TAG;

    /**
     * The table <code>user_tag</code>.
     */
    public final UserTag USER_TAG = UserTag.USER_TAG;

    /**
     * No further instances allowed
     */
    private DefaultSchema() {
        super("", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            TicketTag.TICKET_TAG,
            UserTag.USER_TAG);
    }
}
