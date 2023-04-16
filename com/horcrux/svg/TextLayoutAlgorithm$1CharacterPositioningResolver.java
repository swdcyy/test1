package com.horcrux.svg.TextLayoutAlgorithm$1CharacterPositioningResolver;
import com.horcrux.svg.TextLayoutAlgorithm;
import com.horcrux.svg.TextLayoutAlgorithm$CharacterInformation;
import java.lang.String;
import java.lang.Object;
import com.horcrux.svg.TextView;
import java.lang.Class;
import com.horcrux.svg.TSpanView;
import com.horcrux.svg.TextPathView;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Math;

public class TextLayoutAlgorithm$1CharacterPositioningResolver	// class@000603
{
    public int global;
    public boolean horizontal;
    public boolean in_text_path;
    public String[] resolve_dx;
    public String[] resolve_dy;
    public String[] resolve_x;
    public String[] resolve_y;
    public TextLayoutAlgorithm$CharacterInformation[] result;
    public final TextLayoutAlgorithm this$0;

    public void TextLayoutAlgorithm$1CharacterPositioningResolver(TextLayoutAlgorithm p0,TextLayoutAlgorithm$CharacterInformation[] p1,String[] p2,String[] p3,String[] p4,String[] p5){
       this.this$0 = p0;
       super();
       this.global = 0;
       this.horizontal = true;
       this.in_text_path = false;
       this.result = p1;
       this.resolve_x = p2;
       this.resolve_y = p3;
       this.resolve_dx = p4;
       this.resolve_dy = p5;
    }
    public final void resolveCharacterPositioning(TextView p0){
       int i5;
       TextLayoutAlgorithm$1CharacterPositioningResolver u1CharacterP = this;
       TSpanView tSpanView = p0;
       boolean b = true;
       int i = 0;
       if (p0.getClass() == TextView.class || p0.getClass() == TSpanView.class) {
          TextLayoutAlgorithm$1CharacterPositioningResolver global = u1CharacterP.global;
          String[] stringArray = new String[i];
          String[] stringArray1 = new String[i];
          String[] stringArray2 = new String[i];
          String[] stringArray3 = new String[i];
          double[] uodoubleArra = new double[i];
          int i1 = (u1CharacterP.in_text_path == null)? Math.max(i, i): 0;
          tSpanView = tSpanView.mContent;
          tSpanView = (tSpanView == null)? 0: tSpanView.length();
          int i2 = 0;
          int i3 = 0;
          while (i2 < tSpanView) {
             TextLayoutAlgorithm$1CharacterPositioningResolver result = u1CharacterP.result;
             int i4 = global + i2;
             if (result[i4].addressable != null) {
                object oobject = result[i4];
                if (i3 >= i1) {
                   b = false;
                }
                oobject.anchoredChunk = b;
                if (i3 < 0) {
                   u1CharacterP.resolve_x[i4] = stringArray[i3];
                }
                TextLayoutAlgorithm$1CharacterPositioningResolver in_text_path = u1CharacterP.in_text_path;
                String str = "";
                if (in_text_path != null && u1CharacterP.horizontal == null) {
                   u1CharacterP.resolve_x[global] = str;
                }
                if (i3 < 0) {
                   u1CharacterP.resolve_y[i4] = stringArray1[i3];
                }
                if (in_text_path != null && u1CharacterP.horizontal != null) {
                   u1CharacterP.resolve_y[global] = str;
                }
                if (i3 < 0) {
                   u1CharacterP.resolve_dx[i4] = stringArray2[i3];
                }
                if (i3 < 0) {
                   u1CharacterP.resolve_dy[i4] = stringArray3[i3];
                }
                if (i3 < 0) {
                   result[i4].rotate = uodoubleArra[i3];
                }
             }
             i3 = i3 + 1;
             i2 = i2 + 1;
             b = true;
             TextLayoutAlgorithm$1CharacterPositioningResolver u1CharacterP1 = null;
          }
       }else if(p0.getClass() == TextPathView.class){
          u1CharacterP.result[u1CharacterP.global].anchoredChunk = b;
          u1CharacterP.in_text_path = b;
          for (int i6 = 0; i6 < p0.getChildCount(); i6 = i6 + 1) {
             u1CharacterP.resolveCharacterPositioning(tSpanView.getChildAt(i6));
          }
          if (tSpanView instanceof TextPathView) {
             u1CharacterP.in_text_path = i;
          }
       }
       return;
    }
}
