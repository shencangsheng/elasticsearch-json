/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: CentricModel
 * Author:   shencangsheng
 * Date:     2020/12/30 5:40 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package org.elasticsearch.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author shencangsheng
 * @create 2020/12/30
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CentricModel {
    private List<QueryModel> query;
    private String dsl;
}