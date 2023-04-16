package c.t.m.g.do;
import c.t.m.g.du;
import c.t.m.g.do$1;
import java.lang.Object;
import org.json.JSONObject;
import java.lang.String;
import java.lang.StringBuilder;
import android.os.Parcel;

public class do implements du	// class@000c4f
{
    public String a;
    public String b;
    public String c;
    public double d;
    public double e;
    public double f;
    public String g;
    public String h;
    public static final Parcelable$Creator CREATOR;

    static {
       do.CREATOR = new do$1();
    }
    public void do(){
       super();
    }
    public void do(JSONObject p0){
       super();
       this.a = p0.optString("name");
       this.b = p0.optString("dtype");
       this.c = p0.optString("addr");
       this.d = p0.optDouble("pointx");
       this.e = p0.optDouble("pointy");
       this.f = p0.optDouble("dist");
       this.g = p0.optString("direction");
       this.h = p0.optString("tag");
    }
    public int describeContents(){
       return 0;
    }
    public String toString(){
       return "AddressData{"+"name="+this.a+","+"dtype="+this.b+","+"pointx="+this.d+","+"pointy="+this.e+","+"dist="+this.f+","+"direction="+this.g+","+"tag="+this.h+","+"}";
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeString(this.a);
       p0.writeString(this.b);
       p0.writeString(this.c);
       p0.writeDouble(this.d);
       p0.writeDouble(this.e);
       p0.writeDouble(this.f);
       p0.writeString(this.g);
       p0.writeString(this.h);
    }
}
