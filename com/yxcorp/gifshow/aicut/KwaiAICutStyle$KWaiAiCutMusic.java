package com.yxcorp.gifshow.aicut.KwaiAICutStyle$KWaiAiCutMusic;
import java.io.Serializable;
import com.yxcorp.gifshow.aicut.KwaiAICutStyle;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.kuaishan.model.TemplateMusic;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Iterator;
import java.util.List;
import com.kuaishou.android.model.music.Music;
import java.lang.CharSequence;
import android.text.TextUtils;

public class KwaiAICutStyle$KWaiAiCutMusic implements Serializable	// class@00193b
{
    public List mFastTemplateMusic;
    public List mMidTemplateMusic;
    public List mSlowTemplateMusic;
    public final KwaiAICutStyle this$0;
    public static final long serialVersionUID = 0x2fce9eb205cb6f4a;

    public void KwaiAICutStyle$KWaiAiCutMusic(KwaiAICutStyle p0){
       this.this$0 = p0;
       super();
    }
    public TemplateMusic getTemplateMusicById(String p0){
       Iterator iterator;
       TemplateMusic templateMusi;
       KwaiAICutStyle$KWaiAiCutMusic obj = PatchProxy.applyOneRefs(p0, this, KwaiAICutStyle$KWaiAiCutMusic.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mSlowTemplateMusic;
       if (obj != null) {
          iterator = obj.iterator();
          while (true) {
             if (iterator.hasNext()) {
                templateMusi = iterator.next();
                if (TextUtils.equals(templateMusi.mMusic.mId, p0)) {
                   return templateMusi;
                }
                continue ;
             }
          }
       }
       obj = this.mMidTemplateMusic;
       if (obj != null) {
          iterator = obj.iterator();
          while (true) {
             if (iterator.hasNext()) {
                templateMusi = iterator.next();
                if (TextUtils.equals(templateMusi.mMusic.mId, p0)) {
                   return templateMusi;
                }
                continue ;
             }
          }
       }
       obj = this.mFastTemplateMusic;
       if (obj != null) {
          iterator = obj.iterator();
          while (iterator.hasNext()) {
             templateMusi = iterator.next();
             if (TextUtils.equals(templateMusi.mMusic.mId, p0)) {
                return templateMusi;
             }else {
                continue ;
             }
          }
       }
       return null;
    }
}
