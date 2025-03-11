# inheritance

**پروژه اپلیکیشن تجاری ساده:** این پروزه یک اپلیکیشن ساده تجاری است که با زبان جاوا نوشته شده است و شامل کلاس هایی برای مدیریت مشتری ها و نحوه پرداخت انها میباشد.

**ویژپی های این پروژه:**
    الف)package.payment:
    1.  اینترفیس paymentStrategy روش های پرداخت رو به صورت abstract  نشون میده.
    2.   کلاس CreditCardPayment روش پرداخت با کارت اعتباری است.(این کلاس PaymentStrategy را ایمپلمنت میکند)
    3.   کلاس PayPalPayment روش پرداخت با پی پال است.(این کلاس PaymentStrategy را ایمپلمنت میکند)
    4.   کلاس BitcoinPayment روش پرداخت با بیتکوین است.(این کلاس PaymentStrategy را ایمپلمنت میکند)
    5.   ابسترکت Customer نشان دهنده مشتره هاست.
    6.   زیرکلاس RegularCustomer که مشتری های معمولی را نشان میدهد.
    7.   زیرکلاس PremiumCustomer که مشتری های پریمیوم را نشان میدهد.
    8.   در کلاس Main هم چهار مشتری تعریف کردم و هر کدام دو بار پرداختی انجام دادند و اطلاعات مشتری ها و سابقه پرداخت ها را چاپ کردم.
    

**توسعه دهندگان:** یاسمین علی بابایی - 40313025


شاد و پیروز باشید
