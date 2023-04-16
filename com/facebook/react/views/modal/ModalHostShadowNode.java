package com.facebook.react.views.modal.ModalHostShadowNode;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import ze.n0;
import android.content.Context;
import android.graphics.Point;
import rf.a;
import ze.x;

public class ModalHostShadowNode extends LayoutShadowNode	// class@0013c5
{

    public void ModalHostShadowNode(){
       super();
    }
    public void addChildAt(ReactShadowNodeImpl p0,int p1){
       ModalHostShadowNode modalHostSha = ModalHostShadowNode.class;
       if (PatchProxy.isSupport(modalHostSha) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, modalHostSha, "1")) {
          return;
       }
       super.addChildAt(p0, p1);
       Point point = a.a(this.getThemedContext());
       p0.setStyleWidth((float)point.x);
       p0.setStyleHeight((float)point.y);
       return;
    }
    public void addChildAt(x p0,int p1){
       this.addChildAt(p0, p1);
    }
}
