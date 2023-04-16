package g3.b;
import androidx.versionedparcelable.a;
import android.os.Parcel;
import androidx.collection.ArrayMap;
import java.lang.String;
import android.util.SparseIntArray;
import android.os.Bundle;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.os.Parcelable;
import android.os.IBinder;
import android.os.IInterface;
import java.lang.StringBuilder;
import java.lang.ClassLoader;
import java.lang.Class;
import java.lang.Object;
import android.os.Parcelable$Creator;

public class b extends a	// class@00203f
{
    public final SparseIntArray d;
    public final Parcel e;
    public final int f;
    public final int g;
    public final String h;
    public int i;
    public int j;
    public int k;

    public void b(Parcel p0){
       super(p0, p0.dataPosition(), p0.dataSize(), "", new ArrayMap(), new ArrayMap(), new ArrayMap());
    }
    public void b(Parcel p0,int p1,int p2,String p3,ArrayMap p4,ArrayMap p5,ArrayMap p6){
       super(p4, p5, p6);
       this.d = new SparseIntArray();
       this.i = -1;
       this.j = 0;
       this.k = -1;
       this.e = p0;
       this.f = p1;
       this.g = p2;
       this.j = p1;
       this.h = p3;
    }
    public void A(int p0){
       this.a();
       this.i = p0;
       this.d.put(p0, this.e.dataPosition());
       this.L(0);
       this.L(p0);
    }
    public void B(boolean p0){
       this.e.writeInt(p0);
    }
    public void D(Bundle p0){
       this.e.writeBundle(p0);
    }
    public void E(byte[] p0){
       if (p0 != null) {
          this.e.writeInt(p0.length);
          this.e.writeByteArray(p0);
       }else {
          this.e.writeInt(-1);
       }
       return;
    }
    public void G(byte[] p0,int p1,int p2){
       if (p0 != null) {
          this.e.writeInt(p0.length);
          this.e.writeByteArray(p0, p1, p2);
       }else {
          this.e.writeInt(-1);
       }
       return;
    }
    public void H(CharSequence p0){
       TextUtils.writeToParcel(p0, this.e, 0);
    }
    public void J(double p0){
       this.e.writeDouble(p0);
    }
    public void K(float p0){
       this.e.writeFloat(p0);
    }
    public void L(int p0){
       this.e.writeInt(p0);
    }
    public void N(long p0){
       this.e.writeLong(p0);
    }
    public void O(Parcelable p0){
       this.e.writeParcelable(p0, 0);
    }
    public void Q(String p0){
       this.e.writeString(p0);
    }
    public void S(IBinder p0){
       this.e.writeStrongBinder(p0);
    }
    public void T(IInterface p0){
       this.e.writeStrongInterface(p0);
    }
    public void a(){
       b ti = this.i;
       if (ti >= null) {
          int i = this.d.get(ti);
          int i1 = this.e.dataPosition();
          int i2 = i1 - i;
          this.e.setDataPosition(i);
          this.e.writeInt(i2);
          this.e.setDataPosition(i1);
       }
       return;
    }
    public a b(){
       b te = this.e;
       int i = te.dataPosition();
       b tj = this.j;
       if (tj == this.f) {
          tj = this.g;
       }
       tj = new b(te, i, tj, this.h+"  ", this.a, this.b, this.c);
       return v8;
    }
    public boolean f(){
       boolean b = (this.e.readInt())? true: false;
       return b;
    }
    public Bundle h(){
       return this.e.readBundle(b.class.getClassLoader());
    }
    public byte[] i(){
       int i = this.e.readInt();
       if (i < 0) {
          return null;
       }
       byte[] uobyteArray = new byte[i];
       this.e.readByteArray(uobyteArray);
       return uobyteArray;
    }
    public CharSequence k(){
       return TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.e);
    }
    public double m(){
       return this.e.readDouble();
    }
    public boolean n(int p0){
       boolean b;
       while (true) {
          b = true;
          if (this.j < this.g) {
             b tk = this.k;
             if (tk == p0) {
                return b;
             }else if((String.valueOf(tk)).compareTo(String.valueOf(p0)) > 0){
                return false;
             }else {
                this.e.setDataPosition(this.j);
                this.k = this.e.readInt();
                int i = this.j + this.e.readInt();
                this.j = i;
             }
          }else if(this.k == p0){
             b = false;
             break ;
          }
          break ;
       }
       return b;
    }
    public float o(){
       return this.e.readFloat();
    }
    public int q(){
       return this.e.readInt();
    }
    public long s(){
       return this.e.readLong();
    }
    public Parcelable t(){
       return this.e.readParcelable(b.class.getClassLoader());
    }
    public String v(){
       return this.e.readString();
    }
    public IBinder x(){
       return this.e.readStrongBinder();
    }
}
