package com.yxcorp.gifshow.v3.editor.item.PostBaseIcon;
import java.io.Serializable;
import ooc.g;
import java.lang.Object;
import java.util.HashMap;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import yvc.a;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import soc.j$b;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import android.content.Context;
import java.util.Objects;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.RelativeLayout;
import android.widget.FrameLayout;
import android.view.ViewGroup;
import java.lang.CharSequence;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiImageView;
import voc.v;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import lnc.a1;
import java.lang.Number;

public class PostBaseIcon implements Serializable	// class@000fb4
{
    public g mModel;
    public int mOriginIconId;
    public int mOriginTextId;
    public Map mStatusIcons;
    public int mSuccessIconId;
    public static final long serialVersionUID = 0x855a4bf5f0f336f6;

    public void PostBaseIcon(g p0,int p1,int p2){
       super();
       this.mOriginIconId = -1;
       this.mOriginTextId = -1;
       this.mSuccessIconId = -1;
       this.mStatusIcons = new HashMap();
       this.mModel = p0;
       this.mOriginIconId = p1;
       this.mOriginTextId = p2;
    }
    public PostBaseIcon addStatusIcons(String p0,int p1){
       if (PatchProxy.isSupport(PostBaseIcon.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, PostBaseIcon.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mStatusIcons.put(p0, Integer.valueOf(p1));
       return this;
    }
    public void bindIconView(a p0,EditorItemFunc p1,j$b p2,EditorDelegate p3,Context p4){
       int i = 1;
       if (PatchProxy.isSupport(PostBaseIcon.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, PostBaseIcon.class, "5")) {
             return;
          }
       }
       Objects.requireNonNull(p0);
       p2.b.setVisibility(0);
       p2.a.setVisibility(0);
       int i1 = 8;
       p2.f.setVisibility(i1);
       p2.h.setVisibility(i1);
       p2.d.setVisibility(i1);
       p2.i.setVisibility(i1);
       p2.a.setText(p4.getText(this.getOriginTextId()));
       p2.b.setImageDrawable(this.getOriginIconDrawable(p4.getResources()));
       boolean b = (p3 != null && (p3.K(p1) == null || p3.K(p1).G0()))? true: false;
       p2.itemView.setActivated(b);
       p2.a.setActivated(b);
       p2.b.setActivated(b);
       if (p3 == null || (p3.K(p1) != null && !p3.K(p1).a())) {
          i = 0;
       }
    label_009b :
       if (!i) {
          p2.itemView.setVisibility(i1);
       }else {
          p2.itemView.setVisibility(0);
       }
       if (this.mModel == EditorItemFunc.ENHANCE_FILTER) {
          p2.a.setTextColor(a1.a(R.color.arg_RES_7f0620d1));
       }
       if (p2.c != null) {
          boolean b1 = p0.d();
          p2 = p2.c;
          if (b1) {
             i1 = 0;
          }
          p2.setVisibility(i1);
          if (b1) {
             p0.e(0);
          }
       }
       return;
    }
    public g getModel(){
       return this.mModel;
    }
    public Drawable getOriginIconDrawable(Resources p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostBaseIcon.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int originIconId = this.getOriginIconId();
       if (originIconId > 0) {
          return p0.getDrawable(originIconId);
       }
       return null;
    }
    public int getOriginIconId(){
       return this.mOriginIconId;
    }
    public int getOriginTextId(){
       return this.mOriginTextId;
    }
    public int getStatusIconByKey(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostBaseIcon.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Integer integer = this.mStatusIcons.get(p0);
       if (integer != null) {
          return integer.intValue();
       }
       return -1;
    }
    public Drawable getSuccessIconDrawable(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostBaseIcon.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mSuccessIconId > null) {
          return p0.getResources().getDrawable(this.mSuccessIconId);
       }
       return null;
    }
    public PostBaseIcon setSuccessIconId(int p0){
       this.mSuccessIconId = p0;
       return this;
    }
}
