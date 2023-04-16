package com.amap.api.location.CoordinateConverter;
import android.content.Context;
import java.lang.Object;
import com.amap.api.location.DPoint;
import com.loc.fq;
import com.loc.fj;
import com.amap.api.location.CoordinateConverter$1;
import java.lang.Enum;
import com.loc.fl;
import org.json.JSONObject;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.String;
import com.loc.fo;
import java.lang.IllegalArgumentException;
import com.amap.api.location.CoordinateConverter$CoordType;

public class CoordinateConverter	// class@000ed6
{
    public DPoint a;
    public Context j;
    public CoordinateConverter$CoordType k;
    public DPoint l;
    public static int b = 0;
    public static int c = 1;
    public static int d = 2;
    public static int e = 4;
    public static int f = 8;
    public static int g = 16;
    public static int h = 32;
    public static int i = 64;

    public void CoordinateConverter(Context p0){
       super();
       this.k = null;
       this.l = null;
       this.a = null;
       this.j = p0;
    }
    public static float calculateLineDistance(DPoint p0,DPoint p1){
       return fq.a(p0, p1);
    }
    public static boolean isAMapDataAvailable(double p0,double p1){
       return fj.a(p0, p1);
    }
    public synchronized DPoint convert(){
       int b;
       int c;
       CoordinateConverter tl1;
       if (this.k == null) {
          throw new IllegalArgumentException("转换坐标类型不能为空");
       }
       CoordinateConverter tl = this.l;
       if (tl == null) {
          throw new IllegalArgumentException("转换坐标源不能为空");
       }
       if (tl.getLongitude() - 0x4066800000000000 > 0 || this.l.getLongitude() - 0xc066800000000000 < 0) {
          throw new IllegalArgumentException("请传入合理经度");
       }
       if (this.l.getLatitude() - 0x4056800000000000 > 0 || this.l.getLatitude() - 0xc056800000000000 < 0) {
          throw new IllegalArgumentException("请传入合理纬度");
       }
       int i = 0;
       String str = null;
       switch (CoordinateConverter$1.a[this.k.ordinal()]){
           case 1:
             this.a = fl.a(this.l);
             b = CoordinateConverter.b;
             c = CoordinateConverter.c;
             if (!(b & c)) {
                str = "baidu";
             label_00df :
                CoordinateConverter.b = b | c;
                i = 1;
             }
             break;
           case 2:
             this.a = fl.b(this.j, this.l);
             b = CoordinateConverter.b;
             c = CoordinateConverter.d;
             if (!(b & c)) {
                str = "mapbar";
                goto label_00df ;
             }
             break;
           case 3:
             b = CoordinateConverter.b;
             c = CoordinateConverter.e;
             if (!(b & c)) {
                str = "mapabc";
                CoordinateConverter.b = b | c;
                i = 1;
             }
             tl1 = this.l;
          label_006c :
             this.a = tl1;
             break;
           case 4:
             b = CoordinateConverter.b;
             c = CoordinateConverter.f;
             if (!(b & c)) {
                str = "sosomap";
                CoordinateConverter.b = b | c;
                i = 1;
             }
             tl1 = this.l;
             goto label_006c ;
             break;
           case 5:
             b = CoordinateConverter.b;
             c = CoordinateConverter.g;
             if (!(b & c)) {
                str = "aliyun";
                CoordinateConverter.b = b | c;
                i = 1;
             }
             tl1 = this.l;
             goto label_006c ;
             break;
           case 6:
             b = CoordinateConverter.b;
             c = CoordinateConverter.h;
             if (!(b & c)) {
                str = "google";
                CoordinateConverter.b = b | c;
                i = 1;
             }
             tl1 = this.l;
             goto label_006c ;
             break;
           case 7:
             b = CoordinateConverter.b;
             c = CoordinateConverter.i;
             if (!(b & c)) {
                str = "gps";
                CoordinateConverter.b = b | c;
                i = 1;
             }
             tl1 = fl.a(this.j, this.l);
             goto label_006c ;
             break;
           default:
       }
    label_00e4 :
       if (i) {
          JSONObject jSONObject = new JSONObject();
          if (!TextUtils.isEmpty(str)) {
             jSONObject.put("amap_loc_coordinate", str);
          }
          fo.a(this.j, "O021", jSONObject);
       }
       return this.a;
    }
    public synchronized CoordinateConverter coord(DPoint p0){
       if (p0 == null) {
          throw new IllegalArgumentException("传入经纬度对象为空");
       }
       if (p0.getLongitude() - 0x4066800000000000 > 0 || p0.getLongitude() - 0xc066800000000000 < 0) {
          throw new IllegalArgumentException("请传入合理经度");
       }
       if (p0.getLatitude() - 0x4056800000000000 > 0 || p0.getLatitude() - 0xc056800000000000 < 0) {
          throw new IllegalArgumentException("请传入合理纬度");
       }
       this.l = p0;
       return this;
    }
    public synchronized CoordinateConverter from(CoordinateConverter$CoordType p0){
       this.k = p0;
       return this;
    }
}
