package com.kwai.link.model.LogConfig;
import java.lang.Object;

public class LogConfig	// class@000d1f
{
    public String file_path;
    public boolean is_console_enable;
    public boolean is_file_enable;
    public ILog log_callback;
    public int log_level;
    public int max_file_num;
    public int max_file_size;

    public void LogConfig(){
       super();
       this.log_level = 1;
       this.is_console_enable = false;
       this.is_file_enable = false;
       this.max_file_size = 0xa00000;
       this.max_file_num = 10;
    }
}
