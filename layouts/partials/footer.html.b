<footer id="footer">
    <div class="container">

        {{ if isset .Site.Params "about_us" }}
        <div class="col-md-4 col-sm-6">
            <!-- <h4>{{ i18n "aboutUs" }}</h4> -->

            {{ .Site.Params.about_us | safeHTML }}

            <hr class="hidden-md hidden-lg hidden-sm">

        </div>
        <!-- /.col-md-4 -->
        {{ end }}

        <div class="col-md-4 col-sm-6">

            {{ if isset .Site.Params "recent_posts" }}{{ if (default true .Site.Params.footer.recent_posts.enable) }}
            <h4>{{ i18n "recentPosts" }}</h4>

            <div class="blog-entries">
                {{ range first 3 (where .Site.RegularPages "Type" "in" .Site.Params.mainSections) }}
                <div class="item same-height-row clearfix">
                    <div class="image same-height-always">
                        <a href="{{ .Permalink }}">
                          {{ if isset .Params "banner" }}
                            <img src="{{ .Params.banner | relURL }}" class="img-responsive" alt="{{ .Title }}">
                          {{ else }}
                            <img src="{{ "img/placeholder.png" | relURL }}" class="img-responsive" alt="{{ .Title }}">
                          {{ end }}
                        </a>
                    </div>
                    <div class="name same-height-always">
                        <h5><a href="{{ .Permalink }}">{{ .Title }}</a></h5>
                    </div>
                </div>
                {{ end }}
            </div>

            <hr class="hidden-md hidden-lg">
            {{ end }}{{ end }}

        </div>
        <!-- /.col-md-4 -->

        {{ if isset .Site.Params "address" }}
        <div class="col-md-4 col-sm-6">

          <h4>{{ i18n "contactTitle" }}</h4>

            {{ .Site.Params.address | safeHTML }}

	    <a href="{{ default "/contact" .Site.Params.contact_url }}" class="btn btn-small btn-template-main">{{ i18n "contactGoTo" }}</a>

            <hr class="hidden-md hidden-lg hidden-sm">

        </div>
        <!-- /.col-md-4 -->
        {{ end }}

    </div>
    <!-- /.container -->
</footer>

<!-- /#footer -->

<!-- *** FOOTER END *** -->

<!-- *** COPYRIGHT ***
_________________________________________________________ -->

<div id="copyright">
    <div class="container">
        <div class="col-md-12">
            {{ if isset .Site.Params "copyright" }}
            <p class="pull-left">{{ .Site.Params.copyright | safeHTML }}</p>
            {{ end }}
            <!-- 21.06.22 PURCHASED a multi host license -->
            <!-- <p class="pull-right"> -->
            <!-- {{ i18n "templateBy" | markdownify }} <a href="https://bootstrapious.com/p/universal-business-e-commerce-template">Bootstrapious</a>.-->
            <!-- Not removing this link is part of the licence conditions of the template. Thanks for understanding :) -->
            <!-- {{ i18n "portedBy" | markdownify }} <a href="https://github.com/devcows/hugo-universal-theme">DevCows</a>. -->
            <!-- </p> -->
        </div>
    </div>
</div>
<!-- /#copyright -->

<!-- *** COPYRIGHT END *** -->
