package com.kuaishou.merchant.customerservice.notification.a;
import android.content.Context;
import java.lang.Object;
import android.media.AudioManager$OnAudioFocusChangeListener;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import yv3.a;
import android.media.AudioManager;
import android.os.Build$VERSION;
import android.media.AudioAttributes$Builder;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest$Builder;
import android.media.AudioFocusRequest;
import java.lang.Boolean;

public class a	// class@001686
{
    public Context a;
    public AudioManager b;
    public AudioFocusRequest c;
    public AudioManager$OnAudioFocusChangeListener d;
    public a$a e;
    public boolean f;

    public void a(Context p0){
       super();
       this.f = false;
       this.a = p0;
       this.c();
    }
    public final AudioManager$OnAudioFocusChangeListener a(){
       Object obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(this);
    }
    public boolean b(){
       return this.f;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       if (this.d == null) {
          this.d = this.a();
       }
       this.b = this.a.getSystemService("audio");
       if (Build$VERSION.SDK_INT >= 26) {
          this.c = new AudioFocusRequest$Builder(2).setAudioAttributes(new AudioAttributes$Builder().setUsage(5).setContentType(2).build()).setAcceptsDelayedFocusGain(true).setOnAudioFocusChangeListener(this.d).build();
       }
       return;
    }
    public boolean d(){
       a obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b;
       boolean b = false;
       if (obj != null) {
          a td = this.d;
          if (td != null) {
             if (Build$VERSION.SDK_INT >= 26) {
                if (obj.requestAudioFocus(this.c)) {
                label_002d :
                   b = true;
                }
             }else if(obj.requestAudioFocus(td, 5, 2)){
                goto label_002d ;
             }
             this.f = b;
          }
       }
       return b;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       a td = this.d;
       if (td != null) {
          a tb = this.b;
          if (tb != null) {
             boolean b = false;
             if (Build$VERSION.SDK_INT >= 26) {
                if (1 != tb.abandonAudioFocusRequest(this.c)) {
                   b = true;
                }
                this.f = b;
             }else if(1 != tb.abandonAudioFocus(td)){
                b = true;
             }
             this.f = b;
          }
       }
       return;
    }
}
