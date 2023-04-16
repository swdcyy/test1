package l5.h;
import l5.s;
import java.lang.Object;
import android.util.JsonReader;
import java.util.ArrayList;
import android.util.JsonToken;
import java.lang.Float;
import android.graphics.Color;
import i5.c;
import m5.e;

public class h implements s	// class@00251e
{
    public int a;

    public void h(int p0){
       super();
       this.a = p0;
    }
    public Object a(JsonReader p0,float p1){
       double d1;
       h oh = this;
       ArrayList uArrayList = new ArrayList();
       int i = 0;
       h oh1 = (p0.peek() == JsonToken.BEGIN_ARRAY)? 1: null;
       if (oh1) {
          p0.beginArray();
       }
       while (p0.hasNext()) {
          uArrayList.add(Float.valueOf((float)p0.nextDouble()));
       }
       if (oh1) {
          p0.endArray();
       }
       if (oh.a == -1) {
          oh.a = uArrayList.size() / 4;
       }
       oh1 = oh.a;
       float[] uofloatArray = new float[oh1];
       int[] ointArray = new int[oh1];
       int i1 = 0;
       int i2 = 0;
       int i3 = 0;
       int i4 = oh.a * 4;
       double d = 0x406fe00000000000;
       int i5 = 2;
       while (i1 < i4) {
          i4 = i1 / 4;
          d1 = (double)uArrayList.get(i1).floatValue();
          int i6 = i1 % 4;
          if (i6) {
             if (i6 != 1) {
                if (i6 != i5) {
                   if (i6 == 3) {
                      d1 = d1 * d;
                      ointArray[i4] = Color.argb(255, i2, i3, (int)d1);
                   }
                }else {
                   d1 = d1 * d;
                   i3 = (int)d1;
                }
             }else {
                d1 = d1 * d;
                i2 = (int)d1;
             }
          }else {
             uofloatArray[i4] = (float)d1;
          }
          i1 = i1 + 1;
       }
       c uoc = new c(uofloatArray, ointArray);
       if (uArrayList.size() > i4) {
          int i7 = (uArrayList.size() - i4) / i5;
          double[] uodoubleArra = new double[i7];
          double[] uodoubleArra1 = new double[i7];
          i3 = 0;
          while (i4 < uArrayList.size()) {
             i5 = i4 % 2;
             if (!i5) {
                uodoubleArra[i3] = (double)uArrayList.get(i4).floatValue();
             }else {
                uodoubleArra1[i3] = (double)uArrayList.get(i4).floatValue();
                i3 = i3 + 1;
             }
             i4 = i4 + 1;
          }
          for (; i < uoc.c(); i = i + 1) {
             int i8 = uoc.a()[i];
             double d2 = (double)uoc.b()[i];
             i5 = 1;
             while (true) {
                if (i5 < i7) {
                   int i9 = i5 - 1;
                   long l = uodoubleArra[i9];
                   long l1 = uodoubleArra[i5];
                   if (uodoubleArra[i5] - d2 >= 0) {
                      d2 = d2 - l;
                      double d3 = l1 - l;
                      d2 = d2 / d3;
                      long l2 = uodoubleArra1[i9];
                      double d4 = uodoubleArra1[i5] - l2;
                      d2 = d2 * d4;
                      d1 = l2 + d2;
                      d1 = d1 * d;
                      i3 = (int)d1;
                   label_0107 :
                      uoc.a()[i] = Color.argb(i3, Color.red(i8), Color.green(i8), Color.blue(i8));
                   }else {
                      i5 = i5 + 1;
                   }
                }else {
                   i3 = i7 - 1;
                   d2 = uodoubleArra1[i3] * d;
                   i3 = (int)d2;
                   goto label_0107 ;
                }
             }
          }
       }
       return uoc;
    }
}
