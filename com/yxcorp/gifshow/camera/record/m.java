package com.yxcorp.gifshow.camera.record.m;
import erd.o;
import qb9.z;
import android.os.Bundle;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.String;
import brd.t;
import com.yxcorp.gifshow.magic.data.repo.MagicBusinessId;
import com.yxcorp.gifshow.model.response.MagicEmojiResponse;
import e4b.b;
import b4b.i;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import b4b.a;
import java.lang.Iterable;
import ok.o;
import com.google.common.base.Optional;
import qk.y;
import com.yxcorp.gifshow.model.MagicEmoji;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;
import java.util.Iterator;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import e4b.a;
import e4b.c;
import w3b.l;
import w3b.q;
import com.yxcorp.gifshow.camera.record.n;

public final class m implements o	// class@001d58
{
    public final z b;
    public final Bundle c;

    public void m(z p0,Bundle p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       z i;
       m tb = this.b;
       m tc = this.c;
       boolean b = false;
       if (TextUtils.n(tb.w, "follow_rn")) {
          tc.putString("source", tb.w);
          tc.putBoolean("discard_current_post_session", b);
          tc.putString("camera_page_source", tb.w);
          tc.putInt("templateId", tb.k);
          tc.putString("templateName", tb.l);
          tc.putString("templateGroup", tb.m);
       }
       if (!TextUtils.n(tb.x, "slip")) {
          p0 = t.just(p0);
       }else {
          MagicEmojiResponse magicEmojiRe = b.b(MagicBusinessId.VIDEO);
          Object obj = null;
          MagicEmoji$MagicFace obj1 = PatchProxy.applyOneRefs(magicEmojiRe, obj, i.class, "11");
          if (obj1 != PatchProxyResult.class) {
             obj = obj1;
          }else if(magicEmojiRe == null){
             MagicEmoji magicEmoji = y.y(magicEmojiRe.mMagicEmojis, new a(magicEmojiRe)).orNull();
             if (magicEmoji != null && !q.f(magicEmoji.mMagicFaces)) {
                obj = new ArrayList();
                Iterator iterator = magicEmoji.mMagicFaces.iterator();
                while (iterator.hasNext()) {
                   obj1 = iterator.next();
                   if (obj1.mResourceType != null || MagicEmoji$MagicFace.isImmerseMagicFace(obj1)) {
                      continue ;
                   }
                   obj.add(obj1.clone());
                }
             }
          }
          a uoa = c.a();
          z f = tb.f;
          i = tb.i;
          boolean b1 = (!q.f(obj) && obj.size() >= 15)? true: false;
          p0 = uoa.w(f, i, b1, l.e(), "", q.d).map(new n(tb, tc, obj, p0));
       }
       return p0;
    }
}
