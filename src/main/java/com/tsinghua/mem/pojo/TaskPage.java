package com.tsinghua.mem.pojo;

import com.tsinghua.mem.pojo.itemTable;
import com.tsinghua.mem.pojo.taskTable;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
public class TaskPage {
    private String taskid;

    private String tasktypeid;

    private String tasktypename;

    private Date taskdate;

    private String platenumber;

    private String taskoper;

    private Integer taskstate;

    List<itemTable> itemTables;
}
