package com.yxcorp.gifshow.magic.ui.magicemoji.similar.c;
import erd.g;
import com.yxcorp.gifshow.magic.ui.magicemoji.similar.e;
import java.util.List;
import java.lang.Object;
import com.yxcorp.gifshow.magic.data.repo.response.SimilarMagicResponse;
import java.util.Objects;
import java.util.Iterator;
import com.yxcorp.gifshow.magic.data.repo.response.SimilarMagicResponse$SimilarMagics;
import java.util.Map;
import ekd.q;
import java.lang.String;
import java.util.ArrayList;
import w3b.p;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import h5b.b;
import java.lang.Iterable;
import ok.o;
import qk.y;
import s5b.b;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import q87.c;
import com.yxcorp.gifshow.plugin.magicemoji.MagicEmojiPageConfig;
import b4b.i;

public final class c implements g	// class@001c13
{
    public final e b;
    public final List c;

    public void c(e p0,List p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       c tb = this.b;
       c tc = this.c;
       Objects.requireNonNull(tb);
       Iterator iterator = p0.mSimilarMagic.iterator();
       while (iterator.hasNext()) {
          SimilarMagicResponse$SimilarMagics similarMagic = iterator.next();
          if (!tb.r.containsKey(similarMagic.mId)) {
             tb.r.put(similarMagic.mId, q.i(similarMagic.mMagicFaces));
          }
       }
       Iterator iterator1 = tc.iterator();
       while (iterator1.hasNext()) {
          String str = iterator1.next();
          if (!tb.r.containsKey(str)) {
             tb.r.put(str, new ArrayList());
          }
       }
       MagicEmoji$MagicFace magicFace = p.b().g(tb.R8());
       int i = 0;
       if (magicFace != null && y.c(p0.mSimilarMagic, new b(magicFace))) {
          Object[] objArray = new Object[i];
          b.D().w("SimilarPresenter", "处理相似魔表结果 "+magicFace.mName+"-"+magicFace.mId, objArray);
          tb.Z8(magicFace, i.b(tb.r.get(magicFace.mId), tb.t));
       }else {
          Object[] objArray1 = new Object[i];
          b.D().w("SimilarPresenter", "当前选中魔表为空或不在相似魔表结果中", objArray1);
       }
       return;
    }
}
