/*
 * This file is generated by jOOQ.
 */
package de.crafted.api.service.image.jooq;


import de.crafted.api.service.image.jooq.tables.Image;
import de.crafted.api.service.image.jooq.tables.TicketImage;
import de.crafted.api.service.image.jooq.tables.records.ImageRecord;
import de.crafted.api.service.image.jooq.tables.records.TicketImageRecord;

import org.jooq.ForeignKey;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in 
 * the default schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<ImageRecord> IMAGE_PKEY = Internal.createUniqueKey(Image.IMAGE, DSL.name("image_pkey"), new TableField[] { Image.IMAGE.ID }, true);
    public static final UniqueKey<TicketImageRecord> TICKET_IMAGE_PKEY = Internal.createUniqueKey(TicketImage.TICKET_IMAGE, DSL.name("ticket_image_pkey"), new TableField[] { TicketImage.TICKET_IMAGE.TICKET_ID, TicketImage.TICKET_IMAGE.IMAGE_ID }, true);

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<TicketImageRecord, ImageRecord> TICKET_IMAGE__TICKET_IMAGE_IMAGE_ID_FKEY = Internal.createForeignKey(TicketImage.TICKET_IMAGE, DSL.name("ticket_image_image_id_fkey"), new TableField[] { TicketImage.TICKET_IMAGE.IMAGE_ID }, Keys.IMAGE_PKEY, new TableField[] { Image.IMAGE.ID }, true);
}
