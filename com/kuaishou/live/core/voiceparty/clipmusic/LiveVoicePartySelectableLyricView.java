package com.kuaishou.live.core.voiceparty.clipmusic.LiveVoicePartySelectableLyricView;
import com.yxcorp.gifshow.widget.FlattenLyricView;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import android.util.Pair;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.lang.Boolean;
import java.lang.Integer;

public class LiveVoicePartySelectableLyricView extends FlattenLyricView	// class@001381
{
    public List L;

    public void LiveVoicePartySelectableLyricView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.L = new ArrayList();
    }
    public Pair getSelectRange(){
       LiveVoicePartySelectableLyricView obj = PatchProxy.apply(null, this, LiveVoicePartySelectableLyricView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       int i1 = 0;
       int i2 = 0;
       int i3 = 0;
       while (true) {
          if (i1 < this.L.size()) {
             boolean b = this.L.get(i1).booleanValue();
             if (!i2 && b) {
                i3 = i1;
             }
             if (i2 && !b) {
                i1 = i1 - 1;
                i = 1;
             label_003c :
                if (!i && !this.L.isEmpty()) {
                   obj = this.L;
                   if (obj.get((obj.size() - 1)).booleanValue()) {
                      i1 = this.L.size() - 1;
                   }
                }
                if (i1 < i3) {
                   i1 = i3;
                   break ;
                }
                break ;
             }else {
                i1 = i1 + 1;
                i2 = b;
             }
          }else {
             i1 = 0;
             goto label_003c ;
          }
       }
       return new Pair(Integer.valueOf(i3), Integer.valueOf(i1));
    }
    public float getTopFadingEdgeStrength(){
       return 0;
    }
}
