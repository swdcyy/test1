package com.kuaishou.edit.draft.CropOptions$b;
import z30.q;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.CropOptions;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.CropOptions$a;
import com.kuaishou.edit.draft.Transform$b;
import com.kuaishou.edit.draft.Transform;

public final class CropOptions$b extends GeneratedMessageLite$Builder implements q	// class@00175f
{

    public void CropOptions$b(){
       super(CropOptions.DEFAULT_INSTANCE);
    }
    public void CropOptions$b(CropOptions$a p0){
       super(CropOptions.DEFAULT_INSTANCE);
    }
    public CropOptions$b a(int p0){
       this.copyOnWrite();
       this.instance.setHeight(p0);
       return this;
    }
    public CropOptions$b b(Transform$b p0){
       this.copyOnWrite();
       this.instance.setTransform(p0);
       return this;
    }
    public CropOptions$b c(Transform p0){
       this.copyOnWrite();
       this.instance.setTransform(p0);
       return this;
    }
    public CropOptions$b d(int p0){
       this.copyOnWrite();
       this.instance.setWidth(p0);
       return this;
    }
    public boolean getBorderPosLeftBottom(){
       return this.instance.getBorderPosLeftBottom();
    }
    public boolean getBorderPosLeftTop(){
       return this.instance.getBorderPosLeftTop();
    }
    public boolean getBorderPosRightBottom(){
       return this.instance.getBorderPosRightBottom();
    }
    public boolean getBorderPosRightTop(){
       return this.instance.getBorderPosRightTop();
    }
    public float getBorderRadius(){
       return this.instance.getBorderRadius();
    }
    public int getHeight(){
       return this.instance.getHeight();
    }
    public Transform getTransform(){
       return this.instance.getTransform();
    }
    public int getWidth(){
       return this.instance.getWidth();
    }
    public boolean hasTransform(){
       return this.instance.hasTransform();
    }
}
