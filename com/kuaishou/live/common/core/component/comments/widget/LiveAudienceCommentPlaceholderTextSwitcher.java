package com.kuaishou.live.common.core.component.comments.widget.LiveAudienceCommentPlaceholderTextSwitcher;
import android.widget.TextSwitcher;
import java.lang.String;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import android.os.Handler;
import android.os.Looper;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import sf1.a;
import android.widget.ViewSwitcher$ViewFactory;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import android.view.View;
import android.widget.TextView;
import java.lang.CharSequence;
import java.lang.Integer;

public class LiveAudienceCommentPlaceholderTextSwitcher extends TextSwitcher	// class@0010d3
{
    public final List b;
    public long c;
    public int d;
    public boolean e;
    public final Handler f;
    public static final String g;

    static {
       LiveAudienceCommentPlaceholderTextSwitcher.g = a1.p(0x7f101e5d);
    }
    public void LiveAudienceCommentPlaceholderTextSwitcher(Context p0){
       super(p0, null);
    }
    public void LiveAudienceCommentPlaceholderTextSwitcher(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = new ArrayList();
       this.d = -1;
       this.e = false;
       this.f = new Handler(Looper.getMainLooper());
       if (PatchProxy.applyVoid(null, this, LiveAudienceCommentPlaceholderTextSwitcher.class, "9")) {
       }else if(PatchProxy.applyVoid(null, this, LiveAudienceCommentPlaceholderTextSwitcher.class, "10")){
          this.setFactory(new a(this));
       }
       return;
    }
    public String getCurrentContent(){
       LiveAudienceCommentPlaceholderTextSwitcher obj = PatchProxy.apply(null, this, LiveAudienceCommentPlaceholderTextSwitcher.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.e != null) {
          obj = this.d;
          if (obj >= null) {
             LiveAudienceCommentPlaceholderTextSwitcher tb = this.b;
             return tb.get((obj % tb.size()));
          }
       }
       String str = (this.getCurrentView() instanceof TextView)? this.getCurrentView().getText().toString(): LiveAudienceCommentPlaceholderTextSwitcher.g;
       return str;
    }
    public final void setCurrentText(int p0){
       if (PatchProxy.isSupport(LiveAudienceCommentPlaceholderTextSwitcher.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveAudienceCommentPlaceholderTextSwitcher.class, "6")) {
          return;
       }
       if (this.getCurrentView() instanceof TextView) {
          this.setCurrentText(a1.p(p0));
       }else {
          this.setText(a1.p(p0));
       }
       return;
    }
    public void setDisplayIntervalMs(long p0){
       this.c = p0;
    }
    public void setTextColor(int p0){
       if (PatchProxy.isSupport(LiveAudienceCommentPlaceholderTextSwitcher.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveAudienceCommentPlaceholderTextSwitcher.class, "7")) {
          return;
       }
       if (this.getCurrentView() instanceof TextView) {
          this.getCurrentView().setTextColor(p0);
       }
       return;
    }
}
