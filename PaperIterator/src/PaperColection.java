
public class PaperColection implements Container {

	String paperTypes[] = { "Paperboard", "coated paper", "Fine art paper", "Tissue Paper" };

	@Override
	public Iterator getIterator() {

		return new PaperIterator();
	}

	private class PaperIterator implements Iterator {
		int i;

		@Override
		public boolean hasNext() {
			if (i < paperTypes.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if (this.hasNext()) {
				return paperTypes[i++];
			}
			return null;
		}
	}

}
