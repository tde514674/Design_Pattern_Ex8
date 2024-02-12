public class ImageManager {
    private IRendererStrategy rendererStrategy;
    public void setRenderer(IRendererStrategy rendererStrategy) {
		this.rendererStrategy = rendererStrategy;
	}
	public void show() {
		this.rendererStrategy.showImage();
	}
}

