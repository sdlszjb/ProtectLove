package com.protect.love.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.protect.love.bean.OpenProtectUser;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "OPEN_PROTECT_USER".
*/
public class OpenProtectUserDao extends AbstractDao<OpenProtectUser, Long> {

    public static final String TABLENAME = "OPEN_PROTECT_USER";

    /**
     * Properties of entity OpenProtectUser.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "id");
        public final static Property WxId = new Property(1, String.class, "wxId", false, "wxId");
        public final static Property IsOpen = new Property(2, Boolean.class, "isOpen", false, "isOpen");
    }


    public OpenProtectUserDao(DaoConfig config) {
        super(config);
    }
    
    public OpenProtectUserDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"OPEN_PROTECT_USER\" (" + //
                "\"id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"wxId\" TEXT," + // 1: wxId
                "\"isOpen\" INTEGER);"); // 2: isOpen
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"OPEN_PROTECT_USER\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, OpenProtectUser entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String wxId = entity.getWxId();
        if (wxId != null) {
            stmt.bindString(2, wxId);
        }
 
        Boolean isOpen = entity.getIsOpen();
        if (isOpen != null) {
            stmt.bindLong(3, isOpen ? 1L: 0L);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, OpenProtectUser entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String wxId = entity.getWxId();
        if (wxId != null) {
            stmt.bindString(2, wxId);
        }
 
        Boolean isOpen = entity.getIsOpen();
        if (isOpen != null) {
            stmt.bindLong(3, isOpen ? 1L: 0L);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public OpenProtectUser readEntity(Cursor cursor, int offset) {
        OpenProtectUser entity = new OpenProtectUser( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // wxId
            cursor.isNull(offset + 2) ? null : cursor.getShort(offset + 2) != 0 // isOpen
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, OpenProtectUser entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setWxId(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setIsOpen(cursor.isNull(offset + 2) ? null : cursor.getShort(offset + 2) != 0);
     }
    
    @Override
    protected final Long updateKeyAfterInsert(OpenProtectUser entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(OpenProtectUser entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(OpenProtectUser entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
