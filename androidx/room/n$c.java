package androidx.room.n$c;
import android.database.Cursor;
import androidx.room.a;
import java.lang.Object;
import android.database.CharArrayBuffer;
import java.lang.String;
import android.os.Bundle;
import android.net.Uri;
import java.util.List;
import android.database.ContentObserver;
import android.database.DataSetObserver;
import android.content.ContentResolver;

public final class n$c implements Cursor	// class@000969
{
    public final Cursor b;
    public final a c;

    public void n$c(Cursor p0,a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void close(){
       this.b.close();
       this.c.b();
    }
    public void copyStringToBuffer(int p0,CharArrayBuffer p1){
       this.b.copyStringToBuffer(p0, p1);
    }
    public void deactivate(){
       this.b.deactivate();
    }
    public byte[] getBlob(int p0){
       return this.b.getBlob(p0);
    }
    public int getColumnCount(){
       return this.b.getColumnCount();
    }
    public int getColumnIndex(String p0){
       return this.b.getColumnIndex(p0);
    }
    public int getColumnIndexOrThrow(String p0){
       return this.b.getColumnIndexOrThrow(p0);
    }
    public String getColumnName(int p0){
       return this.b.getColumnName(p0);
    }
    public String[] getColumnNames(){
       return this.b.getColumnNames();
    }
    public int getCount(){
       return this.b.getCount();
    }
    public double getDouble(int p0){
       return this.b.getDouble(p0);
    }
    public Bundle getExtras(){
       return this.b.getExtras();
    }
    public float getFloat(int p0){
       return this.b.getFloat(p0);
    }
    public int getInt(int p0){
       return this.b.getInt(p0);
    }
    public long getLong(int p0){
       return this.b.getLong(p0);
    }
    public Uri getNotificationUri(){
       return this.b.getNotificationUri();
    }
    public List getNotificationUris(){
       return this.b.getNotificationUris();
    }
    public int getPosition(){
       return this.b.getPosition();
    }
    public short getShort(int p0){
       return this.b.getShort(p0);
    }
    public String getString(int p0){
       return this.b.getString(p0);
    }
    public int getType(int p0){
       return this.b.getType(p0);
    }
    public boolean getWantsAllOnMoveCalls(){
       return this.b.getWantsAllOnMoveCalls();
    }
    public boolean isAfterLast(){
       return this.b.isAfterLast();
    }
    public boolean isBeforeFirst(){
       return this.b.isBeforeFirst();
    }
    public boolean isClosed(){
       return this.b.isClosed();
    }
    public boolean isFirst(){
       return this.b.isFirst();
    }
    public boolean isLast(){
       return this.b.isLast();
    }
    public boolean isNull(int p0){
       return this.b.isNull(p0);
    }
    public boolean move(int p0){
       return this.b.move(p0);
    }
    public boolean moveToFirst(){
       return this.b.moveToFirst();
    }
    public boolean moveToLast(){
       return this.b.moveToLast();
    }
    public boolean moveToNext(){
       return this.b.moveToNext();
    }
    public boolean moveToPosition(int p0){
       return this.b.moveToPosition(p0);
    }
    public boolean moveToPrevious(){
       return this.b.moveToPrevious();
    }
    public void registerContentObserver(ContentObserver p0){
       this.b.registerContentObserver(p0);
    }
    public void registerDataSetObserver(DataSetObserver p0){
       this.b.registerDataSetObserver(p0);
    }
    public boolean requery(){
       return this.b.requery();
    }
    public Bundle respond(Bundle p0){
       return this.b.respond(p0);
    }
    public void setExtras(Bundle p0){
       this.b.setExtras(p0);
    }
    public void setNotificationUri(ContentResolver p0,Uri p1){
       this.b.setNotificationUri(p0, p1);
    }
    public void setNotificationUris(ContentResolver p0,List p1){
       this.b.setNotificationUris(p0, p1);
    }
    public void unregisterContentObserver(ContentObserver p0){
       this.b.unregisterContentObserver(p0);
    }
    public void unregisterDataSetObserver(DataSetObserver p0){
       this.b.unregisterDataSetObserver(p0);
    }
}
