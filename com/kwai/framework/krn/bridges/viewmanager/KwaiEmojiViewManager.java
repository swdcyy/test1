package com.kwai.framework.krn.bridges.viewmanager.KwaiEmojiViewManager;
import com.facebook.react.uimanager.SimpleViewManager;
import ze.n0;
import android.view.View;
import com.yxcorp.gifshow.widget.EmojiTextView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import tyc.a1;
import android.widget.TextView;
import ak5.j;
import com.yxcorp.gifshow.widget.KSTextDisplayHandler;
import java.lang.CharSequence;
import java.lang.Integer;
import java.lang.Number;
import android.os.Build$VERSION;

public class KwaiEmojiViewManager extends SimpleViewManager	// class@0015df
{
    public String mDisplayEmojiText;
    public int mJustificationMode;

    public void KwaiEmojiViewManager(){
       super();
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public EmojiTextView createViewInstance(n0 p0){
       EmojiTextView obj = PatchProxy.applyOneRefs(p0, this, KwaiEmojiViewManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new EmojiTextView(p0);
       obj.setTag(R.id.emoji_display_handler, new a1(obj));
       return obj;
    }
    public String getName(){
       return "KwaiEmojiView";
    }
    public void initialize(){
       if (PatchProxy.applyVoid(null, this, KwaiEmojiViewManager.class, "1")) {
          return;
       }
       j.o().d();
       return;
    }
    public final void setKSTextDisplayHandler(EmojiTextView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiEmojiViewManager.class, "3")) {
          return;
       }
       KSTextDisplayHandler tag = p0.getTag(R.id.emoji_display_handler);
       tag.o(3);
       p0.setKSTextDisplayHandler(tag);
       p0.setText(p1);
       this.mDisplayEmojiText = p1;
       return;
    }
    public void setTextColor(EmojiTextView p0,Integer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiEmojiViewManager.class, "7")) {
          return;
       }
       if (p1 != null) {
          p0.setTextColor(p1.intValue());
       }else {
          p0.setTextColor(0xff000000);
       }
       return;
    }
    public void setTextEmoji(EmojiTextView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiEmojiViewManager.class, "5")) {
          return;
       }
       p0.setText(p1);
       this.setKSTextDisplayHandler(p0, p1);
       return;
    }
    public void setTextEmojiAlignment(EmojiTextView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiEmojiViewManager.class, "8")) {
          return;
       }
       p0.setGravity(this.translateTextAlignToInt(p0, p1));
       return;
    }
    public void setTextEmojiSize(EmojiTextView p0,int p1){
       KwaiEmojiViewManager kwaiEmojiVie = KwaiEmojiViewManager.class;
       if (PatchProxy.isSupport(kwaiEmojiVie) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, kwaiEmojiVie, "6")) {
          return;
       }
       p0.setTextSize((float)p1);
       this.setKSTextDisplayHandler(p0, this.mDisplayEmojiText);
       return;
    }
    public final int translateTextAlignToInt(EmojiTextView p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, KwaiEmojiViewManager.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       if (("justify").equals(p1)) {
          if (Build$VERSION.SDK_INT >= 26) {
             this.mJustificationMode = 1;
             p0.setJustificationMode(1);
          }
       }else if(Build$VERSION.SDK_INT >= 26){
          this.mJustificationMode = i;
          p0.setJustificationMode(i);
       }
       if (!("left").equals(p1)) {
          if (("center").equals(p1)) {
             i = 17;
          label_005c :
             return (i + 16);
          }else if(("right").equals(p1)){
             i = 5;
             goto label_005c ;
          }else if(p1 == null || ("auto").equals(p1)){
             goto label_005c ;
          }
       }
    label_0029 :
       i = 3;
       goto label_005c ;
    }
}
