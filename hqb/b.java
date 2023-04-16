package hqb.b;
import qvb.f;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import qvb.n0;
import com.yxcorp.gifshow.music.network.model.response.MusicsResponse;
import upb.a;
import upb.f;
import cjd.e;
import erd.o;
import java.util.List;
import qvb.a;
import la6.b;
import java.util.Iterator;
import com.kuaishou.android.model.music.Music;
import android.app.Application;
import o56.a;

public class b extends f	// class@002d22
{
    public final int p;
    public String q;
    public String r;
    public String s;

    public void b(int p0){
       super();
       this.p = p0;
    }
    public t I1(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(this.q)) {
          return objArray;
       }
       Object[] objArray1 = (TextUtils.x(this.s))? objArray: this.s;
       if (!this.K()) {
          objArray = this.L0().getCursor();
       }
       return f.a().c(this.q, this.p, objArray, objArray1, -1, "").map(new e());
    }
    public void M1(Object p0,List p1){
       this.h2(p0, p1);
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       super.clear();
       this.q = null;
       return;
    }
    public void d2(b p0,List p1){
       this.h2(p0, p1);
    }
    public void h2(MusicsResponse p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "3")) {
          return;
       }
       super.d2(p0, p1);
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          Music music = iterator.next();
          music.mCategoryName = a.b().getString(0x7f100f55);
          music.mUssid = p0.mUssid;
          music.mSearchKeyWord = this.q;
          music.mCategoryId = 9999;
       }
       this.r = p0.mUssid;
       return;
    }
}
