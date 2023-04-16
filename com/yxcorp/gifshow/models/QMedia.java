package com.yxcorp.gifshow.models.QMedia;
import java.io.Serializable;
import r79.d;
import r79.e;
import java.lang.String;
import java.lang.Object;
import r79.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.album.vm.viewdata.DataType;
import java.lang.Number;
import java.io.File;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;

public class QMedia implements Serializable, d, e	// class@001fbd
{
    public long created;
    public long duration;
    public long id;
    public String mAlbum;
    public long mClipDuration;
    public long mClipStart;
    public String mExportFilePath;
    public int mExportHeight;
    public float mExportPositionX;
    public float mExportPositionY;
    public int mExportWidth;
    public int mHeight;
    public boolean mIsNeedInvisible;
    public boolean mIsSelected;
    public long mModified;
    public float mRatio;
    public File mThumbnailFile;
    public List mVideoFrameList;
    public int mWidth;
    public int orientation;
    public String path;
    public int position;
    public long size;
    public int type;
    public static final long serialVersionUID = 0x7de855ec28975393;

    public void QMedia(long p0,String p1,long p2,long p3,int p4){
       super();
       this.position = -1;
       this.mIsNeedInvisible = false;
       this.mExportPositionX = 0x3f000000;
       this.mExportPositionY = 0x3f000000;
       this.mIsSelected = false;
       this.orientation = 0;
       this.id = p0;
       this.path = p1;
       this.duration = p2;
       this.created = p3;
       this.type = p4;
    }
    public void QMedia(long p0,String p1,long p2,long p3,long p4,int p5){
       super();
       this.position = -1;
       this.mIsNeedInvisible = false;
       this.mExportPositionX = 0x3f000000;
       this.mExportPositionY = 0x3f000000;
       this.mIsSelected = false;
       this.orientation = 0;
       this.id = p0;
       this.path = p1;
       this.duration = p2;
       this.created = p3;
       this.mModified = p4;
       this.type = p5;
    }
    public void QMedia(long p0,String p1,long p2,long p3,long p4,long p5,int p6){
       super();
       this.position = -1;
       this.mIsNeedInvisible = false;
       this.mExportPositionX = 0x3f000000;
       this.mExportPositionY = 0x3f000000;
       this.mIsSelected = false;
       this.orientation = 0;
       this.id = p0;
       this.path = p1;
       this.duration = p2;
       this.size = p3;
       this.created = p4;
       this.mModified = p5;
       this.type = p6;
    }
    public boolean contentEquals(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, QMedia.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 instanceof QMedia) {
          return this.isSameResource(p0);
       }
       return false;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, QMedia.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       if (this == p0) {
          return true;
       }
       if (p0 instanceof QMedia) {
          return (p0.path).equals(this.path);
       }
       return b;
    }
    public long getClipDuration(){
       return this.mClipDuration;
    }
    public DataType getDataType(){
       Object obj = PatchProxy.apply(null, this, QMedia.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.isVideo()) {
          return DataType.VIDEO;
       }
       if (this.isImage()) {
          return DataType.IMAGE;
       }
       return DataType.CUSTOM;
    }
    public long getDuration(){
       Object obj = PatchProxy.apply(null, this, QMedia.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (this.isVideo()) {
          return this.duration;
       }
       if (this.isImage()) {
          return 3000;
       }
       return this.duration;
    }
    public int getHeight(){
       return this.mHeight;
    }
    public int getOrientation(){
       return this.orientation;
    }
    public String getPath(){
       QMedia tpath = this.path;
       if (tpath != null) {
       }else {
          tpath = "";
       }
       return tpath;
    }
    public int getPosition(){
       return this.position;
    }
    public float getRatio(){
       return this.mRatio;
    }
    public long getSize(){
       return this.size;
    }
    public File getThumbnailFile(){
       return this.mThumbnailFile;
    }
    public String getTypeLoggerStr(){
       Object obj = PatchProxy.apply(null, this, QMedia.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.isVideo()) {
          return "video";
       }
       if (this.isImage()) {
          return "picture";
       }
       return "custom";
    }
    public int getWidth(){
       return this.mWidth;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, QMedia.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (this.path).hashCode();
    }
    public boolean isImage(){
       boolean b = (this.type == null)? true: false;
       return b;
    }
    public boolean isSameResource(QMedia p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, QMedia.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null && (TextUtils.isEmpty(p0.path) || TextUtils.isEmpty(this.path))) {
          return false;
       }
       return (p0.path).equals(this.path);
    }
    public boolean isSelected(){
       return this.mIsSelected;
    }
    public boolean isVideo(){
       QMedia ttype = this.type;
       boolean b = true;
       if (ttype != b && ttype != 2) {
          b = false;
       }
       return b;
    }
    public boolean isVideoType(){
       Object obj = PatchProxy.apply(null, this, QMedia.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.getDataType() == DataType.VIDEO)? true: false;
       return b;
    }
    public boolean objectEquals(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, QMedia.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.equals(p0);
    }
    public void setClipDuration(long p0){
       this.mClipDuration = p0;
    }
    public void setOrientation(int p0){
       this.orientation = p0;
    }
    public void setSelected(boolean p0){
       this.mIsSelected = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, QMedia.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "QMedia id="+this.id+" path="+this.path;
    }
}
