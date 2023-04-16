package com.yxcorp.gifshow.camera.record.duet.controller.DuetLayoutPanel;
import ml8.d;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.widget.textview.TextImageView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import ekd.j;
import tg9.b;
import com.yxcorp.gifshow.camera.record.duet.controller.DuetLayoutManager;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.camera.record.duet.controller.DuetLayoutManager$LayoutMode;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.a;
import android.content.res.ColorStateList;
import android.widget.TextView;
import cd9.j;
import android.view.View$OnClickListener;

public class DuetLayoutPanel extends BaseFragment implements d	// class@000dbc
{
    public TextImageView j;
    public FrameLayout k;
    public TextImageView l;
    public FrameLayout m;
    public TextImageView n;
    public FrameLayout o;
    public DuetLayoutManager p;
    public DuetLayoutManager$LayoutMode q;
    public DuetLayoutManager$LayoutMode[] r;
    public TextImageView[] s;
    public FrameLayout[] t;

    public void DuetLayoutPanel(){
       super();
    }
    public final void ch(){
       if (PatchProxy.applyVoid(null, this, DuetLayoutPanel.class, "6")) {
          return;
       }
       if (this.r == null) {
          return;
       }
       int i = 0;
       DuetLayoutPanel tr = this.r;
       while (i < tr.length) {
          boolean b = (this.q == tr[i])? true: false;
          this.t[i].setSelected(b);
          i = i + 1;
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DuetLayoutPanel.class, "1")) {
          return;
       }
       this.j = m1.f(p0, 0x7f0a36e1);
       this.o = m1.f(p0, 0x7f0a36dd);
       this.m = m1.f(p0, 0x7f0a36dc);
       this.k = m1.f(p0, 0x7f0a36db);
       this.n = m1.f(p0, 0x7f0a36e3);
       this.l = m1.f(p0, 0x7f0a36e2);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, DuetLayoutPanel.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = a.g(p0, R.layout.arg_RES_7f0d1332, p1, false);
       this.doBindView(view);
       return view;
    }
    public void onDestroyView(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, DuetLayoutPanel.class, "7")) {
          return;
       }
       super.onDestroyView();
       if (!PatchProxy.applyVoid(objArray, this, DuetLayoutPanel.class, "9") && (this.p != null && !j.h(this.s))) {
          b uob = this.p.l2();
          DuetLayoutPanel ts = this.s;
          int len = ts.length;
          for (int i = 0; i < len; i = i + 1) {
             uob.removeView(ts[i]);
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DuetLayoutPanel.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.doBindView(p0);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, DuetLayoutPanel.class, "5") && this.r != null) {
          TextImageView[] textImageVie = new TextImageView[]{this.j,this.l,this.n};
          int i = 0;
          int i1 = 2;
          this.s = textImageVie;
          FrameLayout[] uFrameLayout = new FrameLayout[]{this.k,this.m,this.o};
          this.t = uFrameLayout;
          int i2 = 0;
          DuetLayoutPanel tr = this.r;
          while (i2 < tr.length) {
             object oobject = tr[i2];
             Drawable uDrawable = a.r(this.getResources().getDrawable(oobject.mIconLargeRes));
             uDrawable.setDither(1);
             a.o(uDrawable, this.getResources().getColorStateList(R.color.arg_RES_7f061e5f));
             this.s[i2].setTopDrawable(uDrawable);
             this.s[i2].setText(oobject.mNameRes);
             this.t[i2].setOnClickListener(new j(this, oobject));
             i2++;
          }
          this.ch();
          if (!PatchProxy.applyVoid(objArray, this, DuetLayoutPanel.class, "8") && (this.p != null && !j.h(this.s))) {
             b uob = this.p.l2();
             DuetLayoutPanel ts = this.s;
             int len = ts.length;
             for (; i < len; i = i + 1) {
                uob.addView(ts[i]);
             }
          }
       }
       return;
    }
}
