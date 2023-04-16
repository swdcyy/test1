package d22.m;
import com.kuaishou.live.core.basic.widget.e;
import java.lang.Object;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.Buffer;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.opengl.GLES20;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.OutOfMemoryError;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import java.lang.RuntimeException;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import d22.k$b;
import java.lang.Integer;

public class m	// class@002432
{
    public final FloatBuffer a;
    public int b;
    public int[] c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public static final c k;
    public static final float[] l;

    static {
       m.k = e.b;
       m.l = new float[8]{0xbf800000,0x3f800000,0xbf800000,0xbf800000,0x3f800000,0xbf800000,0x3f800000,0x3f800000};
    }
    public void m(){
       super();
       float[] l = m.l;
       FloatBuffer uFloatBuffer = ByteBuffer.allocateDirect((l.length * 4)).order(ByteOrder.nativeOrder()).asFloatBuffer();
       this.a = uFloatBuffer;
       FloatBuffer uFloatBuffer1 = uFloatBuffer.put(l);
       uFloatBuffer1.position(0);
       this.b = 0;
       this.c = null;
       this.h = 0;
    }
    public final void a(String p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "6")) {
          return;
       }
       while (true) {
          i = GLES20.glGetError();
          if (!i) {
             return;
          }
          c k = m.k;
          b.B(k, p0+": glError "+i);
          if (i == 1285) {
             b.B(k, p0+": glError "+i+", OOM ERROR, BUT DON\'T THROW EXCEPTION");
             if (this.j == null) {
                ExceptionHandler.handleCaughtException(new OutOfMemoryError(p0+": glError "+i));
                this.j = true;
             }
          }else {
             break ;
          }
       }
       throw new RuntimeException(p0+": glError "+i);
    }
    public final int b(String p0,String p1){
       int[] obj = PatchProxy.applyTwoRefs(p0, p1, this, m.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.e(0x8b31, p0);
       if (!i) {
          throw new RuntimeException("load VERTEX shader failed\n "+p0);
       }
       int i1 = this.e(0x8b30, p1);
       if (!i1) {
          throw new RuntimeException("load FRAGMENT shader failed\n "+p1);
       }
       int i2 = GLES20.glCreateProgram();
       this.a("glCreateProgram");
       if (!i2) {
          b.Z(m.k, "Could not create program");
       }
       GLES20.glAttachShader(i2, i);
       this.a("glAttachShader");
       GLES20.glAttachShader(i2, i1);
       this.a("glAttachShader");
       GLES20.glLinkProgram(i2);
       i1 = 1;
       obj = new int[i1];
       GLES20.glGetProgramiv(i2, 0x8b82, obj, 0);
       if (obj[0] == i1) {
          return i2;
       }else {
          throw new RuntimeException("failed to link program: "+GLES20.glGetProgramInfoLog(i2));
       }
    }
    public void c(k$b p0){
       int i2;
       m b;
       int i = this;
       Object obj = p0;
       m om = m.class;
       if (PatchProxy.applyVoidOneRefs(obj, i, om, "8")) {
          return;
       }
       int i1 = 0;
       if (obj.f != i.h) {
          c k = m.k;
          b.Z(k, "rotation changes, need to recreate program");
          i.h = obj.f;
          b.Z(k, "new rotation is "+i.h);
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, i, om, "2")) {
             b = i.b;
             if (b != null) {
                GLES20.glDeleteProgram(b);
                i.b = i1;
             }
             b = i.c;
             if (b != null) {
                GLES20.glDeleteTextures(b.length, b, i1);
                i.c = objArray;
             }
          }
          this.d();
       }
       if (PatchProxy.applyVoidOneRefs(obj, i, om, "7")) {
          i2 = 0;
       }else {
          int[] ointArray = new int[1];
          k$b d = obj.d;
          k$b e = obj.e;
          int i3 = (int)((double)d * 0x3fe0000000000000);
          int i4 = (int)((double)e * 0x3fe0000000000000);
          GLES20.glActiveTexture(0x84c0);
          i.a("glActiveTexture");
          int i5 = 3553;
          GLES20.glBindTexture(i5, i.e);
          String str = "glBindTexture";
          i.a(str);
          int i6 = 9729;
          GLES20.glTexParameteri(i5, 0x2801, i6);
          String str1 = "glTexParameter MIN_FILTER";
          i.a(str1);
          GLES20.glTexParameteri(i5, 0x2800, i6);
          String str2 = "glTexParameter MAG_FILTER";
          i.a(str2);
          String str3 = "glActiveTexture";
          float f = 0x47012f00;
          GLES20.glTexParameterf(i5, 0x2802, f);
          GLES20.glTexParameterf(i5, 0x2803, f);
          int i7 = 3317;
          GLES20.glGetIntegerv(i7, ointArray, i1);
          String str4 = "glTexParameter GET UNPACK_ALIGNMENT";
          i.a(str4);
          if (!(d % 4)) {
             i6 = 4;
          }else if(!(d % 2)){
             i6 = 2;
          }else {
             i6 = 1;
          }
          GLES20.glPixelStorei(i7, i6);
          i.a("glTexParameter SET UNPACK_ALIGNMENT");
          String str5 = "glTexParameter SET UNPACK_ALIGNMENT";
          int i8 = i4;
          GLES20.glTexImage2D(3553, 0, 6409, d, e, 0, 6409, 5121, obj.a);
          String str6 = "glTexImage2D";
          i.a(str6);
          GLES20.glPixelStorei(3317, ointArray[0]);
          i.a("glTexParameter RESTORE UNPACK_ALIGNMENT");
          GLES20.glActiveTexture(0x84c1);
          String str7 = str3;
          i.a(str7);
          GLES20.glBindTexture(3553, i.f);
          String str8 = str;
          i.a(str8);
          GLES20.glTexParameteri(3553, 0x2801, 9729);
          String str9 = str1;
          i.a(str9);
          GLES20.glTexParameteri(3553, 0x2800, 9729);
          i.a(str2);
          GLES20.glTexParameterf(3553, 0x2802, 0x47012f00);
          GLES20.glTexParameterf(3553, 0x2803, 0x47012f00);
          int i9 = 3317;
          GLES20.glGetIntegerv(i9, ointArray, 0);
          i.a(str4);
          int i10 = i3 % 4;
          if (!i10) {
             i4 = 4;
          }else if(!(i3 % 2)){
             i4 = 2;
          }else {
             i4 = 1;
          }
          GLES20.glPixelStorei(i9, i4);
          String str10 = str5;
          i.a(str10);
          String str11 = str10;
          int i11 = i3;
          GLES20.glTexImage2D(3553, 0, 6409, i11, i8, 0, 6409, 5121, obj.b);
          i.a(str6);
          GLES20.glPixelStorei(3317, ointArray[0]);
          i.a("glTexParameter RESTORE UNPACK_ALIGNMENT");
          GLES20.glActiveTexture(0x84c2);
          i.a(str7);
          GLES20.glBindTexture(3553, i.g);
          i.a(str8);
          GLES20.glTexParameteri(3553, 0x2801, 9729);
          i.a(str9);
          GLES20.glTexParameteri(3553, 0x2800, 9729);
          i.a(str2);
          GLES20.glTexParameterf(3553, 0x2802, 0x47012f00);
          GLES20.glTexParameterf(3553, 0x2803, 0x47012f00);
          int i12 = 3317;
          GLES20.glGetIntegerv(i12, ointArray, 0);
          i.a(str4);
          if (!i10) {
             i1 = 4;
          }else if(!(i11 % 2)){
             i1 = 2;
          }else {
             i1 = 1;
          }
          GLES20.glPixelStorei(i12, i1);
          i.a(str11);
          GLES20.glTexImage2D(3553, 0, 6409, i11, i8, 0, 6409, 5121, obj.c);
          i.a(str6);
          i2 = 0;
          GLES20.glPixelStorei(3317, ointArray[i2]);
          i.a("glTexParameter RESTORE UNPACK_ALIGNMENT");
       }
       GLES20.glDrawArrays(6, i2, 4);
       i.a("glDrawArrays");
       GLES20.glFinish();
       i.a("glFinish");
       return;
    }
    public final void d(){
       String str1;
       int i = this;
       if (PatchProxy.applyVoid(null, i, m.class, "3")) {
          return;
       }
       c k = m.k;
       b.Z(k, "mRotation is "+i.h);
       m h = i.h;
       int i1 = 3;
       String str = "precision mediump float;\nuniform sampler2D YTexSampler;\nuniform sampler2D UTexSampler;\nuniform sampler2D VTexSampler;\nvarying vec2 yuvTexCoords;\nvoid main\(\) {\n  float y,u,v,r,g,b;\n  y = texture2D\(YTexSampler, yuvTexCoords\).r;\n  u = texture2D\(UTexSampler, yuvTexCoords\).r;\n  v = texture2D\(VTexSampler, yuvTexCoords\).r;\n  mat3 rgbmat = mat3\(1.1643,  1.16430, 1.1643,0.0,    -0.39173, 2.0170,1.5958, -0.81290, 0.0\);\n  vec3 rgboffset = vec3\(-0.870668, 0.529547, -1.08126\);\n  vec3 icolor = clamp\(rgbmat*vec3\(y, u, v\) + rgboffset, 0.0, 1.0\);\n  gl_FragColor = vec4\(icolor.rgb, 1.0\);\n}\n";
       m om = 2;
       int i2 = 1;
       if (h != null) {
          if (h != i2) {
             if (h != om) {
                if (h != i1) {
                   b.B(k, "unsupported rotation degree: "+i.h);
                label_007c :
                   str1 = (i.i != null)? "attribute vec4 vPosition;\nvarying vec2 yuvTexCoords;\nvoid main\(\) {\n  yuvTexCoords.x = \(1.0 - vPosition.x\)/2.0;\n  yuvTexCoords.y =  1.0 - \(vPosition.y + 1.0\)/2.0;\n  gl_Position = vPosition;\n}\n": "attribute vec4 vPosition;\nvarying vec2 yuvTexCoords;\nvoid main\(\) {\n  yuvTexCoords.x = \(vPosition.x + 1.0\)/2.0;\n  yuvTexCoords.y =  1.0 - \(vPosition.y + 1.0\)/2.0;\n  gl_Position = vPosition;\n}\n";
                   i.b = i.b(str1, str);
                }else if(i.i != null){
                   str1 = "attribute vec4 vPosition;\nvarying vec2 yuvTexCoords;\nvoid main\(\) {\n  yuvTexCoords.x = 1.0 - \(1.0 - vPosition.y\)/2.0;\n  yuvTexCoords.y = \(1.0 - vPosition.x\)/2.0;\n  gl_Position = vPosition;\n}\n";
                }else {
                   str1 = "attribute vec4 vPosition;\nvarying vec2 yuvTexCoords;\nvoid main\(\) {\n  yuvTexCoords.x = 1.0 - \(1.0 - vPosition.y\)/2.0;\n  yuvTexCoords.y = \(1.0 + vPosition.x\)/2.0;\n  gl_Position = vPosition;\n}\n";
                }
                i.b = i.b(str1, str);
             }else if(i.i != null){
                str1 = "attribute vec4 vPosition;\nvarying vec2 yuvTexCoords;\nvoid main\(\) {\n  yuvTexCoords.x = \(vPosition.x + 1.0\)/2.0;\n  yuvTexCoords.y = \(vPosition.y + 1.0\)/2.0;\n  gl_Position = vPosition;\n}\n";
             }else {
                str1 = "attribute vec4 vPosition;\nvarying vec2 yuvTexCoords;\nvoid main\(\) {\n  yuvTexCoords.x = \(1.0 - vPosition.x\)/2.0;\n  yuvTexCoords.y = \(vPosition.y + 1.0\)/2.0;\n  gl_Position = vPosition;\n}\n";
             }
             i.b = i.b(str1, str);
          }else if(i.i != null){
             str1 = "attribute vec4 vPosition;\nvarying vec2 yuvTexCoords;\nvoid main\(\) {\n  yuvTexCoords.x = \(1.0 - vPosition.y\)/2.0;\n  yuvTexCoords.y = \(1.0 + vPosition.x\)/2.0;\n  gl_Position = vPosition;\n}\n";
          }else {
             str1 = "attribute vec4 vPosition;\nvarying vec2 yuvTexCoords;\nvoid main\(\) {\n  yuvTexCoords.x = \(1.0 - vPosition.y\)/2.0;\n  yuvTexCoords.y = \(1.0 - vPosition.x\)/2.0;\n  gl_Position = vPosition;\n}\n";
          }
          i.b = i.b(str1, str);
       }else {
          goto label_007c ;
       }
       h = i.b;
       if (h != null) {
          GLES20.glUseProgram(h);
          i.a("glUseProgram");
          i.d = GLES20.glGetAttribLocation(i.b, "vPosition");
          i.a("glGetAttribLocation");
          b.Z(k, "glGetAttribLocation\(\"vPosition\"\) = "+i.d);
          i.e = GLES20.glGetUniformLocation(i.b, "YTexSampler");
          i.a("glGetUniformLocation");
          b.Z(k, "glGetUniformLocation\(\"YTexSampler\"\) = "+i.e);
          i.f = GLES20.glGetUniformLocation(i.b, "UTexSampler");
          i.a("glGetUniformLocation");
          b.Z(k, "glGetUniformLocation\(\"UTexSampler\"\) = "+i.f);
          i.g = GLES20.glGetUniformLocation(i.b, "VTexSampler");
          i.a("glGetUniformLocation");
          b.Z(k, "glGetUniformLocation\(\"VTexSampler\"\) = "+i.g);
          int[] ointArray = new int[i1];
          i.c = ointArray;
          GLES20.glGenTextures(i1, ointArray, 0);
          i.a("glGenTextures");
          GLES20.glActiveTexture(0x84c0);
          i.a("glActiveTexture");
          GLES20.glBindTexture(3553, i.c[0]);
          i.a("glBindTexture: "+i.c[0]);
          GLES20.glTexParameteri(3553, 0x2801, 9729);
          i.a("glTexParameter MIN_FILTER");
          GLES20.glTexParameteri(3553, 0x2800, 9729);
          GLES20.glTexParameterf(3553, 0x2802, 0x47012f00);
          GLES20.glTexParameterf(3553, 0x2803, 0x47012f00);
          i.a("glTexParameter MAG_FILTER");
          GLES20.glBindTexture(3553, 0);
          i.a("glBindTexture: 0");
          GLES20.glActiveTexture(0x84c1);
          i.a("glActiveTexture");
          GLES20.glBindTexture(3553, i.c[i2]);
          i.a("glBindTexture: "+i.c[i2]);
          GLES20.glTexParameteri(3553, 0x2801, 9729);
          i.a("glTexParameter MIN_FILTER");
          GLES20.glTexParameteri(3553, 0x2800, 9729);
          i.a("glTexParameter MAG_FILTER");
          GLES20.glTexParameterf(3553, 0x2802, 0x47012f00);
          GLES20.glTexParameterf(3553, 0x2803, 0x47012f00);
          GLES20.glBindTexture(3553, 0);
          i.a("glBindTexture: 0");
          GLES20.glActiveTexture(0x84c2);
          i.a("glActiveTexture");
          GLES20.glBindTexture(3553, i.c[2]);
          i.a("glBindTexture: "+i.c[2]);
          GLES20.glTexParameteri(3553, 0x2801, 9729);
          i.a("glTexParameter MIN_FILTER");
          GLES20.glTexParameteri(3553, 0x2800, 9729);
          i.a("glTexParameter MAG_FILTER");
          GLES20.glTexParameterf(3553, 0x2802, 0x47012f00);
          GLES20.glTexParameterf(3553, 0x2803, 0x47012f00);
          GLES20.glBindTexture(3553, 0);
          i.a("glBindTexture: 0");
          GLES20.glUniform1i(i.e, 0);
          i.a("glUniform1i YTexSampler");
          GLES20.glUniform1i(i.f, i2);
          i.a("glUniform1i UTexSampler");
          GLES20.glUniform1i(i.g, 2);
          i.a("glUniform1i VTexSampler");
          GLES20.glVertexAttribPointer(i.d, 2, 5126, false, 0, i.a);
          i.a("glVertexAttribPointer");
          GLES20.glEnableVertexAttribArray(i.d);
          i.a("glEnableVertexAttribArray");
          return;
       }else {
          throw new RuntimeException("failed creating program");
       }
    }
    public final int e(int p0,String p1){
       m om = m.class;
       if (PatchProxy.isSupport(om)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, om, "4");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int i = GLES20.glCreateShader(p0);
       this.a("glCreateShader type="+p0);
       GLES20.glShaderSource(i, p1);
       GLES20.glCompileShader(i);
       int[] ointArray = new int[1];
       GLES20.glGetShaderiv(i, 0x8b81, ointArray, 0);
       if (ointArray[0]) {
          return i;
       }else {
          throw new RuntimeException("compile "+p0+" shader failed\n "+p1);
       }
    }
}
