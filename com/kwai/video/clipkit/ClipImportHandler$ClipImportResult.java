package com.kwai.video.clipkit.ClipImportHandler$ClipImportResult;
import java.lang.Object;

public class ClipImportHandler$ClipImportResult	// class@001a27
{
    public String[] exportPaths;
    public ClipImportException[] importExceptions;
    public int[] isRebuild;

    public void ClipImportHandler$ClipImportResult(){
       super();
    }
    public boolean isNeedRebuild(){
       boolean b = false;
       int i = 0;
       while (true) {
          ClipImportHandler$ClipImportResult tisRebuild = this.isRebuild;
          if (i >= tisRebuild.length) {
             return b;
          }
          if (tisRebuild[i] > 0) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
}
