package jj9.c;
import y8c.g;
import y8c.f;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import g9c.a;
import com.yxcorp.gifshow.model.response.HotChannelColumn;
import com.yxcorp.utility.TextUtils;
import java.lang.IllegalArgumentException;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import jj9.a;
import ml8.c;
import mj9.d;
import kj9.b;
import com.yxcorp.gifshow.channel.stagger.header.subentrance.c;

public class c extends g	// class@002aef
{
    public ArrayList w;

    public void c(){
       super();
    }
    public ArrayList a1(int p0,f p1){
       return this.w;
    }
    public int f0(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       String str = TextUtils.I(this.Q0().get(p0).mFullColumnType);
       int i = -1;
       switch (str.hashCode()){
           case 0x9af7cb65:
             if (str.equals("feedTopMargin")) {
                i = 0;
             }
             break;
           case 0xa67b533b:
             if (str.equals("authorCard")) {
                i = 1;
             }
             break;
           case 0xac2d218b:
             if (str.equals("author")) {
                i = 2;
             }
             break;
           case 0xacc57f2c:
             if (str.equals("banner")) {
                i = 3;
             }
             break;
           case 0xb4affe97:
             if (str.equals("photoFullColumn")) {
                i = 4;
             }
             break;
           case 0xcadbe13a:
             if (str.equals("subTag")) {
                i = 5;
             }
             break;
           case 0xd1846d16:
             if (str.equals("subEntrance")) {
                i = 6;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             return 6;
           case 1:
             return 5;
           case 2:
             return 1;
           case 3:
             return 3;
           case 4:
             return 0;
           case 5:
             return 4;
           case 6:
             return 2;
           default:
             throw new IllegalArgumentException("垂类header非法TYPE");
       }
    }
    public f h1(ViewGroup p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoc, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1 != 2) {
          if (p1 != 3) {
             if (p1 != 4) {
                if (p1 == 6) {
                   return new f(a.i(p0, 0x7f0d0675), new a());
                }else {
                   throw new IllegalArgumentException("垂类header非法TYPE");
                }
             }else {
                return new f(a.i(p0, 0x7f0d06c3), new d());
             }
          }else {
             return new f(a.i(p0, 0x7f0d0662), new b());
          }
       }else {
          return new f(a.i(p0, 0x7f0d06c4), new c());
       }
    }
}
