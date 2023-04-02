package com.example.appnotes.data.room;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.appnotes.data.model.Note;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class NoteDao_Impl implements NoteDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Note> __insertionAdapterOfNote;

  private final EntityDeletionOrUpdateAdapter<Note> __deletionAdapterOfNote;

  private final EntityDeletionOrUpdateAdapter<Note> __updateAdapterOfNote;

  public NoteDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfNote = new EntityInsertionAdapter<Note>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `note` (`titleNote`,`contentNote`,`timeNote`,`id`) VALUES (?,?,?,nullif(?, 0))";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Note value) {
        if (value.getTitleNote() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getTitleNote());
        }
        if (value.getContentNote() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getContentNote());
        }
        stmt.bindLong(3, value.getTimeNote());
        stmt.bindLong(4, value.getId());
      }
    };
    this.__deletionAdapterOfNote = new EntityDeletionOrUpdateAdapter<Note>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `note` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Note value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfNote = new EntityDeletionOrUpdateAdapter<Note>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `note` SET `titleNote` = ?,`contentNote` = ?,`timeNote` = ?,`id` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Note value) {
        if (value.getTitleNote() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getTitleNote());
        }
        if (value.getContentNote() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getContentNote());
        }
        stmt.bindLong(3, value.getTimeNote());
        stmt.bindLong(4, value.getId());
        stmt.bindLong(5, value.getId());
      }
    };
  }

  @Override
  public Object insertNote(final Note note, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfNote.insert(note);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteNote(final Note note, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfNote.handle(note);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object updateNote(final Note note, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfNote.handle(note);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public LiveData<List<Note>> getNotes() {
    final String _sql = "select * from note";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"note"}, false, new Callable<List<Note>>() {
      @Override
      public List<Note> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTitleNote = CursorUtil.getColumnIndexOrThrow(_cursor, "titleNote");
          final int _cursorIndexOfContentNote = CursorUtil.getColumnIndexOrThrow(_cursor, "contentNote");
          final int _cursorIndexOfTimeNote = CursorUtil.getColumnIndexOrThrow(_cursor, "timeNote");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final List<Note> _result = new ArrayList<Note>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Note _item;
            final String _tmpTitleNote;
            if (_cursor.isNull(_cursorIndexOfTitleNote)) {
              _tmpTitleNote = null;
            } else {
              _tmpTitleNote = _cursor.getString(_cursorIndexOfTitleNote);
            }
            final String _tmpContentNote;
            if (_cursor.isNull(_cursorIndexOfContentNote)) {
              _tmpContentNote = null;
            } else {
              _tmpContentNote = _cursor.getString(_cursorIndexOfContentNote);
            }
            final long _tmpTimeNote;
            _tmpTimeNote = _cursor.getLong(_cursorIndexOfTimeNote);
            _item = new Note(_tmpTitleNote,_tmpContentNote,_tmpTimeNote);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item.setId(_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Object getNote(final int id, final Continuation<? super Note> continuation) {
    final String _sql = "select * from note where id=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Note>() {
      @Override
      public Note call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTitleNote = CursorUtil.getColumnIndexOrThrow(_cursor, "titleNote");
          final int _cursorIndexOfContentNote = CursorUtil.getColumnIndexOrThrow(_cursor, "contentNote");
          final int _cursorIndexOfTimeNote = CursorUtil.getColumnIndexOrThrow(_cursor, "timeNote");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final Note _result;
          if(_cursor.moveToFirst()) {
            final String _tmpTitleNote;
            if (_cursor.isNull(_cursorIndexOfTitleNote)) {
              _tmpTitleNote = null;
            } else {
              _tmpTitleNote = _cursor.getString(_cursorIndexOfTitleNote);
            }
            final String _tmpContentNote;
            if (_cursor.isNull(_cursorIndexOfContentNote)) {
              _tmpContentNote = null;
            } else {
              _tmpContentNote = _cursor.getString(_cursorIndexOfContentNote);
            }
            final long _tmpTimeNote;
            _tmpTimeNote = _cursor.getLong(_cursorIndexOfTimeNote);
            _result = new Note(_tmpTitleNote,_tmpContentNote,_tmpTimeNote);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _result.setId(_tmpId);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
