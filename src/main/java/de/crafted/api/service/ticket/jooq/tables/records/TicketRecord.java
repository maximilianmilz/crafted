/*
 * This file is generated by jOOQ.
 */
package de.crafted.api.service.ticket.jooq.tables.records;


import de.crafted.api.service.ticket.jooq.enums.Status;
import de.crafted.api.service.ticket.jooq.tables.Ticket;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TicketRecord extends UpdatableRecordImpl<TicketRecord> implements Record7<Long, String, String, Status, LocalDateTime, Long, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>ticket.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>ticket.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>ticket.title</code>.
     */
    public void setTitle(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>ticket.title</code>.
     */
    public String getTitle() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ticket.description</code>.
     */
    public void setDescription(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>ticket.description</code>.
     */
    public String getDescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ticket.status</code>.
     */
    public void setStatus(Status value) {
        set(3, value);
    }

    /**
     * Getter for <code>ticket.status</code>.
     */
    public Status getStatus() {
        return (Status) get(3);
    }

    /**
     * Setter for <code>ticket.created</code>.
     */
    public void setCreated(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>ticket.created</code>.
     */
    public LocalDateTime getCreated() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>ticket.user_id</code>.
     */
    public void setUserId(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>ticket.user_id</code>.
     */
    public Long getUserId() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>ticket.assigned_to</code>.
     */
    public void setAssignedTo(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>ticket.assigned_to</code>.
     */
    public Long getAssignedTo() {
        return (Long) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, String, String, Status, LocalDateTime, Long, Long> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Long, String, String, Status, LocalDateTime, Long, Long> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Ticket.TICKET.ID;
    }

    @Override
    public Field<String> field2() {
        return Ticket.TICKET.TITLE;
    }

    @Override
    public Field<String> field3() {
        return Ticket.TICKET.DESCRIPTION;
    }

    @Override
    public Field<Status> field4() {
        return Ticket.TICKET.STATUS;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return Ticket.TICKET.CREATED;
    }

    @Override
    public Field<Long> field6() {
        return Ticket.TICKET.USER_ID;
    }

    @Override
    public Field<Long> field7() {
        return Ticket.TICKET.ASSIGNED_TO;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getTitle();
    }

    @Override
    public String component3() {
        return getDescription();
    }

    @Override
    public Status component4() {
        return getStatus();
    }

    @Override
    public LocalDateTime component5() {
        return getCreated();
    }

    @Override
    public Long component6() {
        return getUserId();
    }

    @Override
    public Long component7() {
        return getAssignedTo();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getTitle();
    }

    @Override
    public String value3() {
        return getDescription();
    }

    @Override
    public Status value4() {
        return getStatus();
    }

    @Override
    public LocalDateTime value5() {
        return getCreated();
    }

    @Override
    public Long value6() {
        return getUserId();
    }

    @Override
    public Long value7() {
        return getAssignedTo();
    }

    @Override
    public TicketRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public TicketRecord value2(String value) {
        setTitle(value);
        return this;
    }

    @Override
    public TicketRecord value3(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public TicketRecord value4(Status value) {
        setStatus(value);
        return this;
    }

    @Override
    public TicketRecord value5(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public TicketRecord value6(Long value) {
        setUserId(value);
        return this;
    }

    @Override
    public TicketRecord value7(Long value) {
        setAssignedTo(value);
        return this;
    }

    @Override
    public TicketRecord values(Long value1, String value2, String value3, Status value4, LocalDateTime value5, Long value6, Long value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TicketRecord
     */
    public TicketRecord() {
        super(Ticket.TICKET);
    }

    /**
     * Create a detached, initialised TicketRecord
     */
    public TicketRecord(Long id, String title, String description, Status status, LocalDateTime created, Long userId, Long assignedTo) {
        super(Ticket.TICKET);

        setId(id);
        setTitle(title);
        setDescription(description);
        setStatus(status);
        setCreated(created);
        setUserId(userId);
        setAssignedTo(assignedTo);
    }
}
