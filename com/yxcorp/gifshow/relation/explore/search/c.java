package com.yxcorp.gifshow.relation.explore.search.c;
import qvb.f;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qvb.n0;
import com.yxcorp.gifshow.relation.explore.search.ExploreSearchResponse;
import java.lang.CharSequence;
import android.text.TextUtils;
import wkd.b;
import xac.s;
import com.kwai.feature.component.entry.SearchSceneSource;
import cjd.e;
import erd.o;
import java.util.List;
import la6.b;
import java.util.UUID;
import com.yxcorp.gifshow.relation.explore.search.ExploreSearchResponse$a;
import com.kwai.framework.model.user.User;

public class c extends f	// class@001876
{
    public String p;
    public String q;
    public String r;

    public void c(){
       super();
    }
    public t I1(){
       Object[] objArray1;
       Object[] objArray = null;
       ExploreSearchResponse obj = PatchProxy.apply(objArray, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (!this.K())? this.L0(): objArray;
       if (TextUtils.isEmpty(this.p)) {
          return t.just(new ExploreSearchResponse());
       }else {
          s os = b.a(-1334121008);
          c tp = this.p;
          c tq = this.q;
          if (obj != null) {
             objArray = obj.getCursor();
          }
          return os.b(tp, tq, objArray, SearchSceneSource.FIND_FRIEND.mPageSource).map(new e());
       }
    }
    public void M1(Object p0,List p1){
       this.i2(p0, p1);
    }
    public void d2(b p0,List p1){
       this.i2(p0, p1);
    }
    public String h2(){
       return this.p;
    }
    public void i2(ExploreSearchResponse p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "2")) {
          return;
       }
       super.d2(p0, p1);
       if (this.K()) {
          this.q = p0.mUssid;
          this.r = UUID.randomUUID().toString();
       }
       int i = 0;
       while (i < p1.size()) {
          ExploreSearchResponse$a mUser = p1.get(i).mUser;
          if (mUser != null) {
             mUser.mPosition = i;
          }
          i++;
       }
       return;
    }
}
