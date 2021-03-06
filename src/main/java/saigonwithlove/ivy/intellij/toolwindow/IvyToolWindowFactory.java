package saigonwithlove.ivy.intellij.toolwindow;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import org.jetbrains.annotations.NotNull;
import saigonwithlove.ivy.intellij.shared.IvyBundle;

public class IvyToolWindowFactory implements ToolWindowFactory {

  @Override
  public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
    ModuleView moduleView = new ModuleView(project);
    Content engineViewContent =
        ContentFactory.SERVICE
            .getInstance()
            .createContent(moduleView, IvyBundle.message("toolWindow.module.title"), false);
    toolWindow.getContentManager().addContent(engineViewContent);
  }
}
