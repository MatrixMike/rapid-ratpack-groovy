import static ratpack.groovy.Groovy.ratpack

ratpack {
  handlers {
    all(new CORSHandler())
    get {
      render 'Hello World!'
    }
  }
}
