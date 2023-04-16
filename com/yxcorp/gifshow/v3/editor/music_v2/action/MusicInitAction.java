package com.yxcorp.gifshow.v3.editor.music_v2.action.MusicInitAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class MusicInitAction extends EditSdkAction	// class@001079
{
    public final String dataSource;
    public final String taskId;

    public void MusicInitAction(String p0,String p1){
       a.p(p0, "dataSource");
       a.p(p1, "taskId");
       super();
       this.dataSource = p0;
       this.taskId = p1;
    }
    public final String getDataSource(){
       return this.dataSource;
    }
    public final String getTaskId(){
       return this.taskId;
    }
}
