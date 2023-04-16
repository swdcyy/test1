package com.kwai.video.clipkit.FboManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.clipkit.FboManager$Fbo;
import android.opengl.GLES20;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.nio.Buffer;
import java.lang.Number;
import java.lang.Math;

public class FboManager	// class@001a3c
{
    public int mFboHeight;
    public int mFboWidth;
    public FboManager$Fbo mInputFbo;
    public boolean mIsValid;
    public int mOriginFboHeight;
    public int mOriginFboWidth;
    public int mOriginInputTexture;
    public FboManager$Fbo mOutputFbo;
    public static String TAG = "FboManager";
    public static boolean TRACE_FBO_REUSE;

    public void FboManager(){
       super();
       this.mFboWidth = 0;
       this.mFboHeight = 0;
       this.mOriginFboWidth = 0;
       this.mOriginFboHeight = 0;
    }
    public void FboManager(int p0,int p1){
       super();
       this.mFboWidth = 0;
       this.mFboHeight = 0;
       this.mOriginFboWidth = 0;
       this.mOriginFboHeight = 0;
       this.resize(p0, p1);
    }
    public void activeInputFbo(){
       if (PatchProxy.applyVoid(null, this, FboManager.class, "2")) {
          return;
       }
       GLES20.glBindFramebuffer(0x8d40, this.mInputFbo.framebuffer);
       GLES20.glViewport(0, 0, this.mFboWidth, this.mFboHeight);
       return;
    }
    public void activeOutputFbo(){
       if (PatchProxy.applyVoid(null, this, FboManager.class, "3")) {
          return;
       }
       GLES20.glBindFramebuffer(0x8d40, this.mOutputFbo.framebuffer);
       GLES20.glViewport(0, 0, this.mFboWidth, this.mFboHeight);
       return;
    }
    public final FboManager$Fbo createFbo(int p0,int p1){
       FboManager$Fbo obj1;
       Object obj = this;
       FboManager uFboManager = FboManager.class;
       if (PatchProxy.isSupport(uFboManager)) {
          obj1 = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), obj, uFboManager, "5");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       int[] ointArray = new int[1];
       int[] ointArray1 = new int[1];
       int i = 0;
       GLES20.glGenFramebuffers(1, ointArray, i);
       GLES20.glGenTextures(1, ointArray1, i);
       int i1 = 3553;
       GLES20.glBindTexture(i1, ointArray1[i]);
       GLES20.glTexImage2D(3553, 0, 6408, p0, p1, 0, 6408, 5121, null);
       GLES20.glTexParameterf(i1, 0x2800, 9729.00f);
       GLES20.glTexParameterf(i1, 0x2801, 9729.00f);
       GLES20.glTexParameterf(i1, 0x2802, 0x47012f00);
       GLES20.glTexParameterf(i1, 0x2803, 0x47012f00);
       int i2 = 0x8d40;
       GLES20.glBindFramebuffer(i2, ointArray[i]);
       GLES20.glFramebufferTexture2D(i2, 0x8ce0, i1, ointArray1[i], i);
       if (GLES20.glCheckFramebufferStatus(i2) != 0x8cd5) {
          obj.mIsValid = i;
       }
       GLES20.glBindTexture(i1, i);
       GLES20.glBindFramebuffer(i2, i);
       obj1 = new FboManager$Fbo(this, p0, p1, ointArray[i], ointArray1[i]);
       return v7;
    }
    public int getFboHeight(){
       return this.mFboHeight;
    }
    public double getFboScale(){
       FboManager obj = PatchProxy.apply(null, this, FboManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       obj = this.mOriginFboWidth;
       if (obj != null) {
          FboManager tmOriginFboH = this.mOriginFboHeight;
          if (tmOriginFboH != null) {
             return Math.max(Math.min((((double)this.mFboWidth * 0x3ff0000000000000) / (double)obj), (((double)this.mFboHeight * 0x3ff0000000000000) / (double)tmOriginFboH)), 0x3ff0000000000000);
          }
       }
       return 0x3ff0000000000000;
    }
    public int getFboWidth(){
       return this.mFboWidth;
    }
    public int getInputFbo(){
       FboManager tmInputFbo = this.mInputFbo;
       FboManager$Fbo framebuffer = (tmInputFbo != null)? tmInputFbo.framebuffer: 0;
       return framebuffer;
    }
    public int getInputTexture(){
       FboManager tmInputFbo = this.mInputFbo;
       FboManager$Fbo texture = (tmInputFbo != null)? tmInputFbo.texture: 0;
       return texture;
    }
    public int getOutputFbo(){
       FboManager tmOutputFbo = this.mOutputFbo;
       FboManager$Fbo framebuffer = (tmOutputFbo != null)? tmOutputFbo.framebuffer: 0;
       return framebuffer;
    }
    public int getOutputTexture(){
       FboManager tmOutputFbo = this.mOutputFbo;
       FboManager$Fbo texture = (tmOutputFbo != null)? tmOutputFbo.texture: 0;
       return texture;
    }
    public boolean isValid(){
       return this.mIsValid;
    }
    public void releaseFbo(){
       if (PatchProxy.applyVoid(null, this, FboManager.class, "7")) {
          return;
       }
       this.releaseFbo(this.mInputFbo);
       this.releaseFbo(this.mOutputFbo);
       return;
    }
    public void releaseFbo(FboManager$Fbo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FboManager.class, "6")) {
          return;
       }
       int[] ointArray = new int[]{p0.texture};
       int[] ointArray1 = new int[]{p0.framebuffer};
       GLES20.glDeleteTextures(1, ointArray, 0);
       GLES20.glDeleteFramebuffers(1, ointArray1, 0);
       return;
    }
    public void resize(int p0,int p1){
       int i = this;
       int i1 = p0;
       int i2 = p1;
       FboManager uFboManager = FboManager.class;
       if (PatchProxy.isSupport(uFboManager) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), i, uFboManager, "4")) {
          return;
       }
       if (i1 != i.mFboWidth || i2 != i.mFboHeight) {
          i.mFboWidth = i1;
          i.mFboHeight = i2;
          i.mIsValid = true;
          FboManager mInputFbo = i.mInputFbo;
          if (mInputFbo != null) {
             FboManager$Fbo texture = mInputFbo.texture;
             if (texture != null && mInputFbo.framebuffer != null) {
                GLES20.glBindTexture(3553, texture);
                GLES20.glTexImage2D(3553, 0, 6408, i.mFboWidth, i.mFboHeight, 0, 6408, 5121, null);
                GLES20.glBindFramebuffer(0x8d40, i.mInputFbo.framebuffer);
                GLES20.glFramebufferTexture2D(0x8d40, 0x8ce0, 3553, i.mInputFbo.texture, false);
             label_006f :
                FboManager mOutputFbo = i.mOutputFbo;
                if (mOutputFbo != null) {
                   FboManager$Fbo texture1 = mOutputFbo.texture;
                   if (texture1 != null && mOutputFbo.framebuffer != null) {
                      GLES20.glBindTexture(3553, texture1);
                      GLES20.glTexImage2D(3553, 0, 6408, i.mFboWidth, i.mFboHeight, 0, 6408, 5121, null);
                      GLES20.glBindFramebuffer(0x8d40, i.mOutputFbo.framebuffer);
                      GLES20.glFramebufferTexture2D(0x8d40, 0x8ce0, 3553, i.mOutputFbo.texture, false);
                   label_00ab :
                      if (GLES20.glCheckFramebufferStatus(0x8d40) != 0x8cd5) {
                         i.mIsValid = false;
                      }
                      i.mIsValid = true;
                      if (GLES20.glGetError()) {
                         i.mIsValid = false;
                      }
                   }
                }
                i.mOutputFbo = i.createFbo(i.mFboWidth, i.mFboHeight);
                goto label_00ab ;
             }
          }
          i.mInputFbo = this.createFbo(p0, p1);
          goto label_006f ;
       }
       return;
    }
    public void setOriginSize(int p0,int p1){
       this.mOriginFboWidth = p0;
       this.mOriginFboHeight = p1;
    }
    public void swapFbo(){
       FboManager tmInputFbo = this.mInputFbo;
       FboManager$Fbo framebuffer = tmInputFbo.framebuffer;
       FboManager tmOutputFbo = this.mOutputFbo;
       tmInputFbo.framebuffer = tmOutputFbo.framebuffer;
       tmOutputFbo.framebuffer = framebuffer;
       framebuffer = tmInputFbo.texture;
       tmInputFbo.texture = tmOutputFbo.texture;
       tmOutputFbo.texture = framebuffer;
    }
}
