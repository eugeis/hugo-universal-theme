baseurl = "https://devcows.github.io/hugo-universal-theme/" # Configure URL. if using gh-pages https://github.com/<username>/hugo-universal-theme URL: https://<username>.github.io/hugo-universal-theme/
title = "Universal"
theme = "hugo-universal-theme"
themesDir = "../.."
languageCode = "de-de"
# Site language. Available translations in the theme's `/i18n` directory.
defaultContentLanguage = "de"
# Enable comments by entering your Disqus shortname
disqusShortname = "devcows"
# Enable Google Analytics by entering your tracking code
googleAnalytics = ""

# number of words of summarized post content (default 70)
summaryLength = 70

# Define the number of posts per page
paginate = 10

# not pluralize title pages by default
pluralizelisttitles = false

[menu]


# Main menu
[[menu.main]]
    name       = "Home"
    identifier = "menu.home"
    url        = "/"
    weight     = 1

[[menu.main]]
    name       = "Gemeinde"
    identifier = "menu.features"
    url        = "/img/inside_4a.jpg"
    weight     = 2

[[menu.main]]
    name       = "Gemeindeleben"
    identifier = "section.shortcodes"
    url        = ""
    weight     = 1
    parent     = "menu.features"
    post       = 1

[[menu.main]]
    name       = "Über uns"
    url        = "/ueberuns/"
    weight     = 1
    parent     = "section.shortcodes"
    post       = 1

[[menu.main]]
    name       = "Fragen"
    url        = "/fragen/"
    weight     = 2
    parent     = "section.shortcodes"
    post       = 1

[[menu.main]]
    identifier = "livestream"
    name       = "Livestream"
    url        = "https://www.youtube.com/channel/UCVRBQkJxQS_fNKR90c4kscg/live"
    weight     = 3

[[menu.main]]
    identifier = "contact"
    name       = "Kontakt"
    url        = "/contact/"
    weight     = 4


# Top bar social links menu

[[menu.topbar]]
    weight = 1
    name = "Phone"
    url = "tel:+12 34 567 89 01"
    pre = "<i class='fas fa-2x fa-phone'></i>"

[[menu.topbar]]
    weight = 2
    name = "GitHub"
    url = "https://github.com/devcows/hugo-universal-theme"
    pre = "<i class='fab fa-2x fa-github'></i>"

[[menu.topbar]]
    weight = 3
    name = "Facebook"
    url = "http://facebook.com"
    pre = "<i class='fab fa-2x fa-facebook'></i>"

[[menu.topbar]]
    weight = 4
    name = "Twitter"
    url = "http://twitter.com"
    pre = "<i class='fab fa-2x fa-twitter'></i>"

[[menu.topbar]]
    weight = 5
    name = "Email"
    url = "mailto:hello@universal.com"
    pre = "<i class='fas fa-2x fa-envelope'></i>"

[params]
    viewMorePostLink = "/blog/"
    author = "DevCows"
    defaultKeywords = ["devcows", "hugo", "go"]
    mainSections = ["blog"]
    defaultDescription = "Site template made by Devcows using Hugo"

    # Social media
    facebook_site = "" # the Facebook handle of your site ('https://www.facebook.com/HANDLE')
    twitter_site = "GoHugoIO" # the Twitter handle of your site (without the '@')
    default_sharing_image = "img/sharing-default.png"

    # Google Maps widget: If `googleMapsApiKey` is not set, no key will be passed to Google (which likely results in a broken map widget).
    enableGoogleMaps = true
    googleMapsApiKey = "AIzaSyAv7Sza8NSp9_l_g8G2vlo0H4ydEPn_2jY"

    latitude = "-12.043333"
    longitude = "-77.028333"

    # Style options: default (light-blue), blue, green, marsala, pink, red, turquoise, violet
    #style = "default"
    style = "blue"

    # Since this template is static, the contact form uses www.formspree.io as a
    # proxy. The form makes a POST request to their servers to send the actual
    # email. Visitors can send up to a 50 emails each month for free.
    #
    # What you need to do for the setup?
    #
    # - register your account to https://formspree.io/register
    # - login and create new form
    # - set your form's endpoint url under 'formspree_action' below
    # - upload the generated site to your server
    # - test a dummy email yourself
    # - you're done. Happy mailing!
    #
    # Enable the contact form by entering your Formspree.io endpoint url
    formspree_action = "https://formspree.io/sample/of/endpoint"
    contact_form_ajax = false

    # Formspree form supports Google reCAPTCHA Key (type v2).
    # If you use this feature, you should enable reCAPTCHA feature in the Formspree dashboard.
    #
    # By default, Formspree use a redirect page for recaptcha widget.
    # If you use a recaptcha widget in your contact page, you should do next steps.
    # (if you don't want, skip these steps)
    #
    #   1. register your site on Google recaptcha admin page: https://www.google.com/recaptcha/admin
    #   2. select reCAPTCHA v2 and checkbox widget type.
    #   3. remember site key and secret key.
    #   4. enter secret key into "Custom reCAPTCHA Key" field in your Formspree form setting page.
    #   5. change `enableRecaptchaInContactForm` is to true
    #   6. enter site key into `googleRecaptchaKey` to enable a recaptcha widget in your page.
    #
    enableRecaptchaInContactForm = false
    googleRecaptchaKey = "site_key_for_google_recaptcha"

    about_us = "<p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.</p>"
    copyright = "Copyright (c) 2015 - 2016, YourCompany; all rights reserved."

    # Format dates with Go's time formatting
    date_format = "January 2, 2006"

    dropdown_mouse_over = false

    disabled_logo = false
    logo_text = "FECG-Braunschweig"

    logo = "img/logo.png"
    logo_small = "img/logo-small.png"
    contact_url = "/contact"
    address = """<p class="text-uppercase"><strong>Freie Evangeliums-Christengemeinde e.V.</strong>
        <br>Neckarstraße 2
        <br>38120
        <br>Braunschweig
        <br>
        <br>
        <strong></strong>
      </p>
      """

[permalinks]
    blog = "/blog/:year/:month/:day/:filename/"

# Enable or disable top bar with social icons
[params.topbar]
    enable = true
    text = """<p class="hidden-md hidden-lg"><a href="tel:+420 777 555 333" data-animate-hover="pulse"><i class="fas fa-phone"></i></a>
      <a href="mailto:hello@universal.com" data-animate-hover="pulse"><i class="fas fa-envelope"></i></a>
      </p>
      """
# <p class="hidden-sm hidden-xs">Contact us on +420 777 555 333 or hello@universal.com.</p>


# Enable and disable widgets for the right sidebar
[params.widgets]
    categories = true
    tags = true
    search = true

[params.carouselCustomers]
    items = 6
    auto_play = false
    slide_speed = 2000
    pagination_speed = 1000

[params.carouselTestimonials]
    items = 4
    auto_play = false
    slide_speed = 2000
    pagination_speed = 1000

[params.carouselHomepage]
    # All carousel items are defined in their own files. You can find example items
    # at 'exampleSite/data/carousel'.
    # For more information take a look at the README.
    enable = true
    auto_play = true
    slide_speed = 2000
    pagination_speed = 1000

[params.features]
    enable = true
    cols = 3 # Default: 3, Available values 2,3,4,6
    # All features are defined in their own files. You can find example items
    # at 'exampleSite/data/features'.
    # For more information take a look at the README.

[params.testimonials]
    enable = false
    # All testimonials are defined in their own files. You can find example items
    # at 'exampleSite/data/testimonials'.
    # For more information take a look at the README.
    title = "Testimonials"
    subtitle = "We have worked with many clients and we always like to hear they come out from the cooperation happy and satisfied. Have a look what our clients said about us."

[params.see_more]
    enable = true
    icon = "fa-solid fa-tv"
    title = "Wir sind auch online für Sie da"
    subtitle = "Etwas hindert Sie daran, persönlich zu kommen? Kein Problem! Unseren Gottesdienst können sie auch als Livestream verfolgen."
    link_url = "https://www.youtube.com/channel/UCVRBQkJxQS_fNKR90c4kscg/live"
    link_text = "Hier geht es zum Livestream"

[params.clients]
    enable = false
    # All clients are defined in their own files. You can find example items
    # at 'exampleSite/data/clients'.
    # For more information take a look at the README.
    title = "Our Clients"
    subtitle = ""

[params.recent_posts]
    enable = true
    title = "From our blog"
    subtitle = "Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend leo."
    hide_summary = false

[params.footer.recent_posts]
    enable = true

[taxonomies]
  category = "categories"
  tag = "tags"
  author = "authors"
