package ck5.g;
import erd.o;
import com.kwai.emotionsdk.core.j;
import java.lang.Object;
import bk5.b;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.kwai.emotionsdk.bean.EmotionPackage;
import java.util.Collection;
import ekd.q;
import java.lang.StringBuilder;
import nk5.m;
import java.lang.Integer;
import java.util.Map;
import ck5.m;
import hk5.a;
import ik5.b;
import com.kwai.emotionsdk.db.dao.EmotionPackageDao;
import java.lang.Iterable;
import org.greenrobot.greendao.AbstractDao;

public final class g implements o	// class@0006d5
{
    public final j b;

    public void g(j p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       int i;
       g tb = this.b;
       Objects.requireNonNull(tb);
       j oj = j.class;
       b mEmotionPack = p0.mEmotionPackage;
       if (PatchProxy.applyVoidOneRefs(mEmotionPack, tb, oj, "14")) {
       }else if(q.f(mEmotionPack.getMEmotions())){
          i = 0;
       }else {
          i = mEmotionPack.getMEmotions().size();
       }
       m.d("EmotionDataManager", "updateFavoritePackage:"+mEmotionPack.mId+",type:"+mEmotionPack.mType+",size:"+i);
       int i1 = 2;
       m om = tb.a.get(Integer.valueOf(i1));
       if (om != null && om.b(mEmotionPack.mId) != null) {
          EmotionPackage uEmotionPack = om.b(mEmotionPack.mId);
          EmotionPackage mEmotions = uEmotionPack.mEmotions;
          if (mEmotions != null) {
             mEmotions.clear();
             uEmotionPack.mEmotions.addAll(mEmotionPack.mEmotions);
          }else {
             uEmotionPack.mEmotions = mEmotionPack.mEmotions;
          }
       }else {
          om = new m();
          om.a(mEmotionPack.mId, mEmotionPack);
          tb.a.remove(Integer.valueOf(i1));
          tb.a.put(Integer.valueOf(i1), om);
       }
       if (!PatchProxy.applyVoid(null, tb, oj, "15")) {
          a.b().a().a().insertOrReplaceInTx(tb.a());
       }
       return p0.mEmotionPackage;
    }
}
