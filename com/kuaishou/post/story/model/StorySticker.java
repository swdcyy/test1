package com.kuaishou.post.story.model.StorySticker;
import com.google.gson.Gson;
import java.lang.String;
import java.lang.Object;

public class StorySticker	// class@000b79
{
    public String a;
    public static Gson b;
    public static Category c;

    static {
       StorySticker.b = new Gson();
    }
    public void StorySticker(String p0){
       super();
       this.a = p0;
    }
    public String a(){
       return this.a;
    }
}
