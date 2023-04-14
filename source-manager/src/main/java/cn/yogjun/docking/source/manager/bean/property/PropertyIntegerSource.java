package cn.yogjun.docking.source.manager.bean.property;

import cn.yogjun.docking.source.manager.bean.base.SourceSpec;
import lombok.Data;

/**
 * {@link PropertyIntegerSource}
 *
 * @author <a href="mailto:matthew.miao@yunlsp.com">matthew.miao</a>
 * @version ${project.version} - 2023/4/12
 */
@Data
public class PropertyIntegerSource extends SourceSpec {
  private Integer value;
}