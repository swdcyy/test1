package com.yxcorp.gifshow.v3.editor.cover.CoverEditorFragment;
import ppc.m;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.yxcorp.gifshow.v3.editor.cover.CoverEditorFragment$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Iterator;
import java.util.Set;
import brd.a0;
import java.util.List;
import java.util.Collections;
import android.graphics.Bitmap;
import java.util.Map;
import android.view.View;
import android.os.Bundle;
import com.yxcorp.gifshow.fragment.PostBaseFragment;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;

public abstract class CoverEditorFragment extends BaseEditorFragment implements m	// class@000e26
{
    public CoverEditorFragment$a G;

    public void CoverEditorFragment(){
       super();
       this.G = new CoverEditorFragment$a(this);
    }
    public String E7(){
       return "CoverPanel";
    }
    public double Pf(){
       double d;
       Iterator obj = PatchProxy.apply(null, this, CoverEditorFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       obj = this.G.d.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return 0;
          }
          d = obj.next().Pf();
          if (d >= 0) {
             break ;
          }
       }
       return d;
    }
    public a0 Sd(){
       a0 uoa0;
       Iterator obj = PatchProxy.apply(null, this, CoverEditorFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.G.d.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return null;
          }
          uoa0 = obj.next().Sd();
          if (uoa0 != null) {
             break ;
          }
       }
       return uoa0;
    }
    public List V9(){
       List list;
       Iterator obj = PatchProxy.apply(null, this, CoverEditorFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.G.d.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return Collections.emptyList();
          }
          list = obj.next().V9();
          if (list != null) {
             break ;
          }
       }
       return list;
    }
    public String Yf(){
       String str;
       Iterator obj = PatchProxy.apply(null, this, CoverEditorFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.G.d.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return "";
          }
          str = obj.next().Yf();
          if (str != null) {
             break ;
          }
       }
       return str;
    }
    public Bitmap getCover(){
       Bitmap cover;
       Iterator obj = PatchProxy.apply(null, this, CoverEditorFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.G.d.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return null;
          }
          cover = obj.next().getCover();
          if (cover != null) {
             break ;
          }
       }
       return cover;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CoverEditorFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(CoverEditorFragment.class, null);
       return objectsByTag;
    }
    public String k8(){
       String str;
       Iterator obj = PatchProxy.apply(null, this, CoverEditorFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.G.d.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return "";
          }
          str = obj.next().k8();
          if (str != null) {
             break ;
          }
       }
       return str;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CoverEditorFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       return;
    }
    public void yh(){
       if (PatchProxy.applyVoid(null, this, CoverEditorFragment.class, "1")) {
          return;
       }
       this.G.c = this.getResources().getString(0x7f100909);
       return;
    }
}
