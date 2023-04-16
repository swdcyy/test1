package com.yxcorp.gifshow.music.utils.h;
import java.util.concurrent.Callable;
import java.lang.Object;
import com.yxcorp.gifshow.music.utils.m;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.util.Arrays;
import kqb.w;
import java.util.Comparator;
import java.util.Collections;
import java.util.Iterator;
import java.lang.Integer;
import java.io.FileReader;
import java.io.Reader;
import qkd.c;
import fg6.a;
import com.kuaishou.android.model.music.Music;
import com.google.gson.Gson;
import java.lang.Exception;
import o56.c;
import o56.a;
import com.kuaishou.android.model.music.MusicType;
import com.kwai.feature.post.api.music.data.HistoryMusic;

public final class h implements Callable	// class@002095
{
    public static final h b;

    static {
       h.b = new h();
    }
    public void h(){
       super();
    }
    public final Object call(){
       Music music;
       ArrayList uArrayList = PatchProxy.apply(null, null, m.class, "6");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          ArrayList uArrayList1 = new ArrayList();
          File uFile = m.c();
          if (uFile.isDirectory()) {
             List list = Arrays.asList(uFile.listFiles());
             Collections.sort(list, new w());
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                Object obj = iterator.next();
                if (!obj.isDirectory()) {
                }else {
                   String name = obj.getName();
                   try{
                      if (PatchProxy.applyOneRefs(name, null, m.class, "12") != PatchProxyResult.class) {
                      }else {
                         String[] stringArray = name.split("%");
                         int len = stringArray.length;
                         for (int i = 0; i < len; i = i + 1) {
                            Integer.parseInt(stringArray[i]);
                         }
                      }
                      File uFile1 = new File(obj, m.a);
                      File uFile2 = new File(obj, m.b);
                      File uFile3 = new File(obj, m.c);
                      File uFile4 = new File(obj, m.d);
                      uFile = new File(obj, m.e);
                      File uFile5 = new File(obj, m.f);
                      File uFile6 = new File(obj, m.g);
                      if (uFile1.isFile() || (!uFile2.isFile() || !uFile.isFile())) {
                         continue ;
                      }else {
                         try{
                            music = a.a.h(c.k(new FileReader(uFile)), Music.class);
                         }catch(java.lang.Exception e0){
                            e0.printStackTrace();
                            music = null;
                         }
                         if (music == null) {
                            continue ;
                         }else {
                            Music mNewType = music.mNewType;
                            if (mNewType != null) {
                               music.mType = mNewType;
                            }
                            if (a.a().b() && music.mType == MusicType.BAIDU) {
                               continue ;
                            }else {
                               String path = obj.getPath();
                               String str = (uFile1.isFile())? uFile1.getAbsolutePath(): null;
                               String str1 = (uFile2.isFile())? uFile2.getAbsolutePath(): null;
                               String str2 = (uFile3.isFile())? uFile3.getPath(): null;
                               String str3 = (uFile5.isFile())? uFile5.getAbsolutePath(): null;
                               String str4 = (uFile6.isFile())? uFile6.getAbsolutePath(): null;
                               String str5 = (uFile4.isFile())? uFile4.getAbsolutePath(): null;
                               HistoryMusic historyMusic = new HistoryMusic(music, path, str, str1, str2, str3, str4, str5, obj.lastModified());
                               uArrayList1.add(mNewType);
                            }
                         }
                      }
                   }catch(java.lang.Exception e0){
                      e0.printStackTrace();
                      goto label_0036 ;
                   }
                }
             }
          }
          uArrayList = uArrayList1;
       }
       return uArrayList;
    }
}
