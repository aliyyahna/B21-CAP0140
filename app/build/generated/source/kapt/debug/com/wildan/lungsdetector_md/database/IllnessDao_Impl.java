package com.wildan.lungsdetector_md.database;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class IllnessDao_Impl implements IllnessDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<DataIllnessEntity> __insertionAdapterOfDataIllnessEntity;

  private final SharedSQLiteStatement __preparedStmtOfDelete;

  public IllnessDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDataIllnessEntity = new EntityInsertionAdapter<DataIllnessEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `IllnessData` (`IllnessId`,`type`,`desc`,`name`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DataIllnessEntity value) {
        if (value.getIllnessId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getIllnessId());
        }
        if (value.getType() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getType());
        }
        if (value.getDesc() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDesc());
        }
        final Integer _tmp;
        _tmp = value.getName() == null ? null : (value.getName() ? 1 : 0);
        if (_tmp == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, _tmp);
        }
      }
    };
    this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM illnessdata WHERE IllnessId =?";
        return _query;
      }
    };
  }

  @Override
  public long insert(final DataIllnessEntity ilness) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfDataIllnessEntity.insertAndReturnId(ilness);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int delete(final String id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDelete.acquire();
    int _argIndex = 1;
    if (id == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, id);
    }
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfDelete.release(_stmt);
    }
  }

  @Override
  public List<DataIllnessEntity> getAll() {
    final String _sql = "SELECT * FROM illnessdata";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfIllnessId = CursorUtil.getColumnIndexOrThrow(_cursor, "IllnessId");
      final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
      final int _cursorIndexOfDesc = CursorUtil.getColumnIndexOrThrow(_cursor, "desc");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final List<DataIllnessEntity> _result = new ArrayList<DataIllnessEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final DataIllnessEntity _item;
        final Integer _tmpIllnessId;
        if (_cursor.isNull(_cursorIndexOfIllnessId)) {
          _tmpIllnessId = null;
        } else {
          _tmpIllnessId = _cursor.getInt(_cursorIndexOfIllnessId);
        }
        final String _tmpType;
        if (_cursor.isNull(_cursorIndexOfType)) {
          _tmpType = null;
        } else {
          _tmpType = _cursor.getString(_cursorIndexOfType);
        }
        final String _tmpDesc;
        if (_cursor.isNull(_cursorIndexOfDesc)) {
          _tmpDesc = null;
        } else {
          _tmpDesc = _cursor.getString(_cursorIndexOfDesc);
        }
        final Boolean _tmpName;
        final Integer _tmp;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getInt(_cursorIndexOfName);
        }
        _tmpName = _tmp == null ? null : _tmp != 0;
        _item = new DataIllnessEntity(_tmpIllnessId,_tmpType,_tmpDesc,_tmpName);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public DataIllnessEntity loadById(final int id) {
    final String _sql = "SELECT * FROM illnessdata WHERE IllnessId =?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfIllnessId = CursorUtil.getColumnIndexOrThrow(_cursor, "IllnessId");
      final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
      final int _cursorIndexOfDesc = CursorUtil.getColumnIndexOrThrow(_cursor, "desc");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final DataIllnessEntity _result;
      if(_cursor.moveToFirst()) {
        final Integer _tmpIllnessId;
        if (_cursor.isNull(_cursorIndexOfIllnessId)) {
          _tmpIllnessId = null;
        } else {
          _tmpIllnessId = _cursor.getInt(_cursorIndexOfIllnessId);
        }
        final String _tmpType;
        if (_cursor.isNull(_cursorIndexOfType)) {
          _tmpType = null;
        } else {
          _tmpType = _cursor.getString(_cursorIndexOfType);
        }
        final String _tmpDesc;
        if (_cursor.isNull(_cursorIndexOfDesc)) {
          _tmpDesc = null;
        } else {
          _tmpDesc = _cursor.getString(_cursorIndexOfDesc);
        }
        final Boolean _tmpName;
        final Integer _tmp;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getInt(_cursorIndexOfName);
        }
        _tmpName = _tmp == null ? null : _tmp != 0;
        _result = new DataIllnessEntity(_tmpIllnessId,_tmpType,_tmpDesc,_tmpName);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
