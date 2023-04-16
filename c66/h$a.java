package c66.h$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Application;
import o56.a;
import java.io.File;
import d66.a;
import java.lang.Integer;
import java.util.Map;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import android.util.Pair;
import com.kwai.framework.config.stat.utils.a;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class h$a	// class@000658
{
    public static final String a;

    static {
       Map map;
       FileChannel uFileChannel;
       RandomAccessFile randomAccess;
       int i3;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String str = "1";
       String str1 = PatchProxy.apply(objArray, objArray, h$a.class, str);
       if (str1 != patchProxyRe) {
       }else {
          File uFile = new File(a.b().getPackageResourcePath());
          a uoa = a.class;
          Object[] objArray1 = PatchProxy.applyOneRefs(uFile, objArray, uoa, str);
          if (objArray1 != patchProxyRe) {
          }else {
             int i = 0x71777777;
             if (PatchProxy.isSupport(uoa)) {
                Object[] obj = PatchProxy.applyTwoRefs(uFile, Integer.valueOf(i), objArray, uoa, "2");
                if (obj != patchProxyRe) {
                   objArray = obj;
                }else if(PatchProxy.isSupport(uoa)){
                   obj = PatchProxy.applyTwoRefs(uFile, Integer.valueOf(i), objArray, uoa, "3");
                   if (obj != patchProxyRe) {
                   }else {
                      try{
                      label_005c :
                         map = PatchProxy.applyOneRefs(uFile, objArray, uoa, "5");
                         if (map != patchProxyRe) {
                         }else {
                            try{
                               String str2 = "r";
                               try{
                                  randomAccess = new RandomAccessFile(uFile, str2);
                                  uFileChannel = randomAccess.getChannel();
                                  try{
                                     i3 = a.b(a.a(uFileChannel).first);
                                     if (uFileChannel != null) {
                                        uFileChannel.close();
                                     }
                                  }catch(java.io.IOException e0){
                                  }catch(java.io.IOException e0){
                                  }catch(com.kwai.framework.config.stat.utils.SignatureNotFoundException e0){
                                     map = i3;
                                  }
                               }catch(java.io.IOException e0){
                                  uFileChannel = objArray;
                               }
                            }catch(java.io.IOException e0){
                               try{
                                  uFileChannel = objArray;
                                  randomAccess = uFileChannel;
                               }catch(java.io.IOException e0){
                               }catch(com.kwai.framework.config.stat.utils.SignatureNotFoundException e0){
                               }
                            }
                         label_00aa :
                            randomAccess.close();
                            goto label_00ad ;
                         }
                      }catch(java.io.IOException e0){
                      }catch(com.kwai.framework.config.stat.utils.SignatureNotFoundException e0){
                      }
                      if (map != null) {
                         ByteBuffer uByteBuffer = map.get(Integer.valueOf(i));
                         if (uByteBuffer != null) {
                            Object obj1 = PatchProxy.applyOneRefs(uByteBuffer, objArray, uoa, "4");
                            if (obj1 != patchProxyRe) {
                               obj = obj1;
                            }else {
                               int i1 = uByteBuffer.arrayOffset();
                               int i2 = uByteBuffer.position() + i1;
                               byte[] uobyteArray = Arrays.copyOfRange(uByteBuffer.array(), i2, (i1 + uByteBuffer.limit()));
                            }
                         }
                      }
                      obj = objArray;
                   }
                }else {
                   goto label_005c ;
                }
                if (obj != null) {
                   try{
                      objArray = new String(obj, "UTF-8");
                   }catch(java.io.UnsupportedEncodingException e0){
                      e0.printStackTrace();
                   }
                }
             }else {
                goto label_0046 ;
             }
          }
          if (objArray1 != null) {
             str1 = URLEncoder.encode(objArray1, "UTF-8");
          }else {
             str1 = objArray1;
          }
       }
       h$a.a = str1;
    }
    public void h$a(){
       super();
    }
}
