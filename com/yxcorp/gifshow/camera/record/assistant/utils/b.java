package com.yxcorp.gifshow.camera.record.assistant.utils.b;
import erd.g;
import com.yxcorp.gifshow.camera.record.assistant.utils.f;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantResponse;
import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantTemplateGroup;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.magic.data.repo.MagicBusinessId;
import com.yxcorp.gifshow.model.response.MagicEmojiResponse;
import f4b.k;
import com.yxcorp.gifshow.camera.record.assistant.utils.a;
import java.lang.Iterable;
import ok.o;
import com.google.common.base.Optional;
import qk.y;
import com.yxcorp.gifshow.model.MagicEmoji;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import dc9.d;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.camera.record.assistant.model.MagicAssistantTemplate;

public final class b implements g	// class@001d21
{
    public final f b;
    public final String c;

    public void b(f p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       b tb = this.b;
       b tc = this.c;
       Objects.requireNonNull(tb);
       ArrayList uArrayList = new ArrayList();
       p0 = p0.getTemplateGroup().iterator();
       while (true) {
          if (p0.hasNext()) {
             AssistantTemplateGroup uAssistantTe = p0.next();
             if (uAssistantTe.getGroupType() == 1) {
                uArrayList = uAssistantTe.getTemplates();
             }
          }
          if (uArrayList.size() < 5) {
             p0 = PatchProxy.apply(null, tb, f.class, "2");
             if (p0 != PatchProxyResult.class) {
             }else {
                p0 = k.d(MagicBusinessId.VIDEO);
                p0 = (p0 != null)? y.y(p0.mMagicEmojis, a.b).orNull(): null;
                if (p0 != null) {
                   p0 = p0.mMagicFaces;
                }else {
                   p0 = null;
                }
             }
             int i = 0;
             while (p0 != null && (i < p0.size() && uArrayList.size() < 5)) {
                MagicEmoji$MagicFace magicFace = p0.get(i);
                if (y.i(uArrayList, new d(magicFace), null) == null && !TextUtils.n(tc, magicFace.mId)) {
                   MagicAssistantTemplate magicAssista = new MagicAssistantTemplate();
                   magicAssista.setMagicFace(magicFace);
                   uArrayList.add(magicAssista);
                }
                i = i + 1;
             }
          }
          break ;
       }
       return;
    }
}
